package com.example.gmall.manage.service.impl;

import com.example.gmall.entity.PmsSkuAttrValue;
import com.example.gmall.entity.PmsSkuImage;
import com.example.gmall.entity.PmsSkuInfo;
import com.example.gmall.entity.PmsSkuSaleAttrValue;
import com.example.gmall.mapper.PmsSkuAttrValueMapper;
import com.example.gmall.mapper.PmsSkuImageMapper;
import com.example.gmall.mapper.PmsSkuInfoMapper;
import com.example.gmall.mapper.PmsSkuSaleAttrValueMapper;
import com.example.gmall.service.SkuService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author lxk
 * @date 2020/12/3 15:06
 */
@Service
public class SkuServiceImpl implements SkuService {

    @Autowired
    private PmsSkuInfoMapper pmsSkuInfoMapper;

    @Autowired
    private PmsSkuAttrValueMapper pmsSkuAttrValueMapper;

    @Autowired
    private PmsSkuSaleAttrValueMapper pmsSkuSaleAttrValueMapper;

    @Autowired
    private PmsSkuImageMapper pmsSkuImageMapper;

    @Override
    public void saveSkuInfo(PmsSkuInfo skuInfo) {
        pmsSkuInfoMapper.insertSelective(skuInfo);
        List<PmsSkuAttrValue> skuAttrValueList = skuInfo.getSkuAttrValueList();
        for (PmsSkuAttrValue pmsSkuAttrValue : skuAttrValueList) {
            pmsSkuAttrValue.setSkuId(skuInfo.getId());
            pmsSkuAttrValueMapper.insertSelective(pmsSkuAttrValue);
        }
        List<PmsSkuSaleAttrValue> skuSaleAttrValueList = skuInfo.getSkuSaleAttrValueList();
        List<PmsSkuImage> skuImageList = skuInfo.getSkuImageList();
    }
}
