package com.example.gmall.manage.service.impl;

import com.example.gmall.entity.PmsBaseAttrInfo;
import com.example.gmall.entity.PmsBaseAttrValue;
import com.example.gmall.entity.PmsBaseSaleAttr;
import com.example.gmall.mapper.PmsBaseAttrInfoMapper;
import com.example.gmall.mapper.PmsBaseAttrValueMapper;
import com.example.gmall.mapper.PmsBaseSaleAttrMapper;
import com.example.gmall.service.PmsAttrService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lxk
 * @date 2020/11/28 17:42
 */
@Service
public class PmsAttrServiceImpl implements PmsAttrService {

    @Autowired
    private PmsBaseAttrInfoMapper infoMapper;

    @Autowired
    private PmsBaseAttrValueMapper valueMapper;

    @Autowired
    private PmsBaseSaleAttrMapper baseSaleAttrMapper;

    @Override
    public List<PmsBaseAttrInfo> getAttrInfo(Long catalog3Id) {
        PmsBaseAttrInfo attrInfo = new PmsBaseAttrInfo();
        attrInfo.setCatalog3Id(catalog3Id);
        List<PmsBaseAttrInfo> attrInfoList = infoMapper.select(attrInfo);
        for (PmsBaseAttrInfo pmsBaseAttrInfo : attrInfoList) {
            List<PmsBaseAttrValue> pmsBaseAttrValues = new ArrayList<>();
            PmsBaseAttrValue pmsBaseAttrValue = new PmsBaseAttrValue();
            pmsBaseAttrValue.setAttrId(pmsBaseAttrInfo.getId());
            pmsBaseAttrValues = valueMapper.select(pmsBaseAttrValue);
            pmsBaseAttrInfo.setAttrValueList(pmsBaseAttrValues);
        }
        return attrInfoList;
    }

    @Override
    public void saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo) {
        List<PmsBaseAttrValue> pmsBaseAttrValueList = pmsBaseAttrInfo.getAttrValueList();
        if (StringUtils.isEmpty(pmsBaseAttrInfo.getId())) {
            // id为空，保存操作
            infoMapper.insertSelective(pmsBaseAttrInfo);
            for (PmsBaseAttrValue pmsBaseAttrValue : pmsBaseAttrValueList) {
                pmsBaseAttrValue.setAttrId(pmsBaseAttrInfo.getId());
                valueMapper.insertSelective(pmsBaseAttrValue);
            }
        } else {
            // id不为空，修改操作
            // 修改属性
            Example example = new Example(PmsBaseAttrInfo.class);
            example.createCriteria().andEqualTo("id",pmsBaseAttrInfo.getId());
            infoMapper.updateByExampleSelective(pmsBaseAttrInfo,example);
            // 修改属性值，先删除原来的
            PmsBaseAttrValue oldPmsBaseAttrValue = new PmsBaseAttrValue();
            oldPmsBaseAttrValue.setAttrId(pmsBaseAttrInfo.getId());
            valueMapper.delete(oldPmsBaseAttrValue);
            // 再修改
            for (PmsBaseAttrValue newAttrValue : pmsBaseAttrValueList) {
                newAttrValue.setAttrId(pmsBaseAttrInfo.getId());
                valueMapper.insertSelective(newAttrValue);
            }
        }
    }

    @Override
    public List<PmsBaseAttrValue> getAttrValueList(Long attrId) {
        PmsBaseAttrValue pmsBaseAttrValue = new PmsBaseAttrValue();
        pmsBaseAttrValue.setAttrId(attrId);
        return valueMapper.select(pmsBaseAttrValue);
    }

    @Override
    public List<PmsBaseSaleAttr> getBaseSaleAttrList() {
        return baseSaleAttrMapper.selectAll();
    }
}
