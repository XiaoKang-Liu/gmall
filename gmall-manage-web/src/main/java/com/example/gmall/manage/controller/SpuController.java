package com.example.gmall.manage.controller;

import com.example.gmall.entity.PmsProductImage;
import com.example.gmall.entity.PmsProductInfo;
import com.example.gmall.entity.PmsProductSaleAttr;
import com.example.gmall.manage.utils.FastDfsUtil;
import com.example.gmall.service.SpuService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @author lxk
 * @date 2020/11/30 11:00
 */
@RestController
@CrossOrigin
public class SpuController {

    private static final String IMAGE_BASE_URL = "182.92.61.75:8888/";

    @Reference(timeout = 5000)
    private SpuService spuService;

    @Autowired
    private FastDfsUtil fastDfsUtil;

    @RequestMapping("/spuList")
    public List<PmsProductInfo> getSpuList(Long catalog3Id){
        List<PmsProductInfo> productInfoList = spuService.getSpuList(catalog3Id);
        return productInfoList;
    }

    /**
     * 保存要添加的spu信息
     * @param pmsProductInfo
     * @return
     */
    @RequestMapping("/saveSpuInfo")
    public String saveSpuInfo(@RequestBody PmsProductInfo pmsProductInfo){
        spuService.saveSpuInfo(pmsProductInfo);
        return "success";
    }

    @RequestMapping("/spuSaleAttrList")
    public List<PmsProductSaleAttr> getSpuSaleAttrList(@RequestParam("spuId")Long spuId) {
        List<PmsProductSaleAttr> pmsProductSaleAttrs = spuService.getSpuSaleAttrList(spuId);
        return pmsProductSaleAttrs;
    }

    @RequestMapping("/spuImageList")
    public List<PmsProductImage> getSpuImageList(@RequestParam("spuId")Long spuId) {
        List<PmsProductImage> pmsProductImages = spuService.getSpuImageList(spuId);
        return pmsProductImages;
    }

    @RequestMapping("/fileUpload")
    public String fileUpload(@RequestParam("file")MultipartFile multipartFile){
        String uploadUrl = null;
        try {
            uploadUrl = fastDfsUtil.upload(multipartFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return IMAGE_BASE_URL+uploadUrl;
    }
}
