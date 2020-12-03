package com.example.gmall.service;

import com.example.gmall.entity.PmsBaseCatalog1;
import com.example.gmall.entity.PmsBaseCatalog2;
import com.example.gmall.entity.PmsBaseCatalog3;

import java.util.List;

public interface CatalogService {

    /**
     * 获取一级分类列表
     * @return
     */
    List<PmsBaseCatalog1> getCatalog1();

    /**
     * 根据一级分类id获取对应二级分类列表
     * @param catalog1Id 一级分类id
     * @return
     */
    List<PmsBaseCatalog2> getCatalog2(Integer catalog1Id);

    /**
     * 根据二级分类id获取对应三级分类列表
     * @param catalog2Id 二级分类id
     * @return
     */
    List<PmsBaseCatalog3> getCatalog3(Long catalog2Id);
}
