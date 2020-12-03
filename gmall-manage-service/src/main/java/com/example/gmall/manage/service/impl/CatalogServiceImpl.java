package com.example.gmall.manage.service.impl;

import com.example.gmall.entity.PmsBaseCatalog1;
import com.example.gmall.entity.PmsBaseCatalog2;
import com.example.gmall.entity.PmsBaseCatalog3;
import com.example.gmall.mapper.PmsBaseCatalog1Mapper;
import com.example.gmall.mapper.PmsBaseCatalog2Mapper;
import com.example.gmall.mapper.PmsBaseCatalog3Mapper;
import com.example.gmall.service.CatalogService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class CatalogServiceImpl implements CatalogService {

    @Autowired
    private PmsBaseCatalog1Mapper catalog1Mapper;

    @Autowired
    private PmsBaseCatalog2Mapper catalog2Mapper;

    @Autowired
    private PmsBaseCatalog3Mapper catalog3Mapper;

    @Override
    public List<PmsBaseCatalog1> getCatalog1() {
        return catalog1Mapper.selectAll();
    }

    @Override
    public List<PmsBaseCatalog2> getCatalog2(Integer catalog1Id) {
        PmsBaseCatalog2 catalog2 = new PmsBaseCatalog2();
        catalog2.setCatalog1Id(catalog1Id);
        List<PmsBaseCatalog2> catalog2List = catalog2Mapper.select(catalog2);
        return catalog2List;
    }

    @Override
    public List<PmsBaseCatalog3> getCatalog3(Long catalog2Id) {
        PmsBaseCatalog3 catalog3 = new PmsBaseCatalog3();
        catalog3.setCatalog2Id(catalog2Id);
        List<PmsBaseCatalog3> catalog3List = catalog3Mapper.select(catalog3);
        return catalog3List;
    }
}
