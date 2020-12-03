package com.example.gmall.service;

import com.example.gmall.entity.PmsProductImage;
import com.example.gmall.entity.PmsProductInfo;
import com.example.gmall.entity.PmsProductSaleAttr;

import java.util.List;

/**
 * @author lxk
 * @date 2020/11/30 11:02
 */
public interface SpuService {

    /**
     * 获取商品信息列表
     * @param catalog3Id
     * @return
     */
    List<PmsProductInfo> getSpuList(Long catalog3Id);

    /**
     * 保存商品信息（sku）
     * @param pmsProductInfo
     */
    void saveSpuInfo(PmsProductInfo pmsProductInfo);

    List<PmsProductSaleAttr> getSpuSaleAttrList(Long spuId);

    List<PmsProductImage> getSpuImageList(Long spuId);
}
