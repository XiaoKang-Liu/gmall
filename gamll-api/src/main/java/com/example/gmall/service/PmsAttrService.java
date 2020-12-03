package com.example.gmall.service;

import com.example.gmall.entity.PmsBaseAttrInfo;
import com.example.gmall.entity.PmsBaseAttrValue;
import com.example.gmall.entity.PmsBaseSaleAttr;

import java.util.List;

/**
 * @author llk
 */
public interface PmsAttrService {

    /**
     * 根据三级分类id获取对于商品分类属性
     * @param catalog3Id
     * @return
     */
    List<PmsBaseAttrInfo> getAttrInfo(Long catalog3Id);

    /**
     * 保存商品属性及属性值
     * @param pmsBaseAttrInfo
     */
    void saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo);

    /**
     * 根据属性名称id查询对应属性值列表
     * @param attrId
     * @return
     */
    List<PmsBaseAttrValue> getAttrValueList(Long attrId);

    /**
     * 获取销售属性
     * @return
     */
    List<PmsBaseSaleAttr> getBaseSaleAttrList();
}
