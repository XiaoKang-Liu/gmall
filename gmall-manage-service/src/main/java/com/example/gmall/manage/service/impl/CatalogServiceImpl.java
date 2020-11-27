package com.example.gmall.manage.service.impl;

import com.example.gmall.entity.PmsBaseCatalog1;
import com.example.gmall.mapper.PmsBaseCatalog1Mapper;
import com.example.gmall.service.CatalogService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class CatalogServiceImpl implements CatalogService {

    @Autowired
    private PmsBaseCatalog1Mapper catalog1Mapper;

    @Override
    public List<PmsBaseCatalog1> getCatalog1() {
        return catalog1Mapper.selectAll();
    }
}
