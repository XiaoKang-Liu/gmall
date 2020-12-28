package com.example.gmall.service;

import com.example.gmall.entity.PmsSearchParam;
import com.example.gmall.entity.PmsSearchSkuInfo;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @author lxk
 * @date 2020/12/10 15:06
 */
public interface SearchService {

    /**
     * 根据参数在es的索引获取搜索结果
     * @param pmsSearchParam
     * @return
     */
    List<Map<String,Object>>  getSearchResult(PmsSearchParam pmsSearchParam) throws IOException;
}
