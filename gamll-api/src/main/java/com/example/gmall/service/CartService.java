package com.example.gmall.service;

import com.example.gmall.entity.OmsCartItem;

import java.util.List;

/**
 * @author lxk
 * @date 2020/12/15 19:09
 */
public interface CartService {

    /**
     * 通过memberId查询数据库对应的购物车信息
     * @param memberId
     * @param skuId
     * @return
     */
    OmsCartItem ifCartExitByUser(String memberId, Long skuId);

    /**
     * 添加购物车信息
     * @param omsCartItem
     */
    void addCart(OmsCartItem omsCartItem);

    /**
     * 更新购物车信息
     * @param omsCartItemFromDb
     */
    void updateCart(OmsCartItem omsCartItemFromDb);

    /**
     * 同步memberId用户的购物车信息到redis
     * @param memberId
     */
    void flushCartCache(String memberId);

    /**
     * 获取购物车列表
     * @param userId
     * @return
     */
    List<OmsCartItem> getCartList(String userId);

    /**
     * 检查购物车状态
     * @param omsCartItem
     */
    void checkCart(OmsCartItem omsCartItem);
}
