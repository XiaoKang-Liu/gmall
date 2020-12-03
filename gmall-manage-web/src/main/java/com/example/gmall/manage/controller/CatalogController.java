package com.example.gmall.manage.controller;

import com.example.gmall.entity.PmsBaseCatalog1;
import com.example.gmall.entity.PmsBaseCatalog2;
import com.example.gmall.entity.PmsBaseCatalog3;
import com.example.gmall.service.CatalogService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Administrator
 */
@RestController
@CrossOrigin
public class CatalogController {

    @Reference(timeout = 5000)
    private CatalogService catalogService;

    @RequestMapping("/getCatalog1")
    public List<PmsBaseCatalog1> getCatalog1(){
        List<PmsBaseCatalog1> pmsBaseCatalog1List = catalogService.getCatalog1();
        return pmsBaseCatalog1List;
    }

    @RequestMapping("/getCatalog2")
    public List<PmsBaseCatalog2> getCatalog2(@RequestParam("catalog1Id") Integer catalog1Id){
        List<PmsBaseCatalog2> pmsBaseCatalog2List = catalogService.getCatalog2(catalog1Id);
        return pmsBaseCatalog2List;
    }

    @RequestMapping("/getCatalog3")
    public List<PmsBaseCatalog3> getCatalog3(@RequestParam("catalog2Id")Long catalog2Id){
        List<PmsBaseCatalog3> pmsBaseCatalog3List = catalogService.getCatalog3(catalog2Id);
        return pmsBaseCatalog3List;
    }


}
