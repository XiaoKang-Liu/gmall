package com.example.gmall.manage.controller;

import com.example.gmall.entity.PmsBaseAttrInfo;
import com.example.gmall.entity.PmsBaseAttrValue;
import com.example.gmall.entity.PmsBaseSaleAttr;
import com.example.gmall.service.PmsAttrService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author lxk
 */
@RestController
@CrossOrigin
public class PmsAttrController {

    @Reference(timeout = 5000)
    private PmsAttrService pmsAttrService;

    /**
     * 保存商品属性及属性值
     * @param pmsBaseAttrInfo
     * @return
     */
    @RequestMapping("/saveAttrInfo")
    public String saveAttrInfo(@RequestBody PmsBaseAttrInfo pmsBaseAttrInfo){
        pmsAttrService.saveAttrInfo(pmsBaseAttrInfo);
        return "success";
    }

    /**
     * 获取三级分类对应的属性列表
     * @param catalog3Id
     * @return
     */
    @RequestMapping("/attrInfoList")
    public List<PmsBaseAttrInfo> getAttrInfo(@RequestParam("catalog3Id") Long catalog3Id){
        List<PmsBaseAttrInfo> attrInfoList = pmsAttrService.getAttrInfo(catalog3Id);
        return attrInfoList;
    }

    @RequestMapping("/getAttrValueList")
    public List<PmsBaseAttrValue> getAttrValueList(@RequestParam("attrId")Long attrId){
        List<PmsBaseAttrValue> attrValueList = pmsAttrService.getAttrValueList(attrId);
        return attrValueList;
    }

    @RequestMapping("/baseSaleAttrList")
    public List<PmsBaseSaleAttr> getBaseSaleAttrList(){
        List<PmsBaseSaleAttr> baseSaleAttrList = pmsAttrService.getBaseSaleAttrList();
        return baseSaleAttrList;
    }
}
