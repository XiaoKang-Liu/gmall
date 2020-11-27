package com.example.gmall.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "pms_sku_info")
public class PmsSkuInfo implements Serializable {
    /**
     * 库存id(itemID)
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 商品id
     */
    @Column(name = "product_id")
    private Long productId;

    /**
     * 价格
     */
    @Column(name = "price")
    private Double price;

    /**
     * sku名称
     */
    @Column(name = "sku_name")
    private String skuName;

    /**
     * 商品规格描述
     */
    @Column(name = "sku_desc")
    private String skuDesc;

    @Column(name = "weight")
    private Double weight;

    /**
     * 品牌(冗余)
     */
    @Column(name = "tm_id")
    private Long tmId;

    /**
     * 三级分类id（冗余)
     */
    @Column(name = "catalog3_id")
    private Long catalog3Id;

    /**
     * 默认显示图片(冗余)
     */
    @Column(name = "sku_default_img")
    private String skuDefaultImg;

    private static final long serialVersionUID = 1L;

    /**
     * 获取库存id(itemID)
     *
     * @return id - 库存id(itemID)
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置库存id(itemID)
     *
     * @param id 库存id(itemID)
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取商品id
     *
     * @return product_id - 商品id
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * 设置商品id
     *
     * @param productId 商品id
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * 获取价格
     *
     * @return price - 价格
     */
    public Double getPrice() {
        return price;
    }

    /**
     * 设置价格
     *
     * @param price 价格
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * 获取sku名称
     *
     * @return sku_name - sku名称
     */
    public String getSkuName() {
        return skuName;
    }

    /**
     * 设置sku名称
     *
     * @param skuName sku名称
     */
    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    /**
     * 获取商品规格描述
     *
     * @return sku_desc - 商品规格描述
     */
    public String getSkuDesc() {
        return skuDesc;
    }

    /**
     * 设置商品规格描述
     *
     * @param skuDesc 商品规格描述
     */
    public void setSkuDesc(String skuDesc) {
        this.skuDesc = skuDesc;
    }

    /**
     * @return weight
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * @param weight
     */
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    /**
     * 获取品牌(冗余)
     *
     * @return tm_id - 品牌(冗余)
     */
    public Long getTmId() {
        return tmId;
    }

    /**
     * 设置品牌(冗余)
     *
     * @param tmId 品牌(冗余)
     */
    public void setTmId(Long tmId) {
        this.tmId = tmId;
    }

    /**
     * 获取三级分类id（冗余)
     *
     * @return catalog3_id - 三级分类id（冗余)
     */
    public Long getCatalog3Id() {
        return catalog3Id;
    }

    /**
     * 设置三级分类id（冗余)
     *
     * @param catalog3Id 三级分类id（冗余)
     */
    public void setCatalog3Id(Long catalog3Id) {
        this.catalog3Id = catalog3Id;
    }

    /**
     * 获取默认显示图片(冗余)
     *
     * @return sku_default_img - 默认显示图片(冗余)
     */
    public String getSkuDefaultImg() {
        return skuDefaultImg;
    }

    /**
     * 设置默认显示图片(冗余)
     *
     * @param skuDefaultImg 默认显示图片(冗余)
     */
    public void setSkuDefaultImg(String skuDefaultImg) {
        this.skuDefaultImg = skuDefaultImg;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productId=").append(productId);
        sb.append(", price=").append(price);
        sb.append(", skuName=").append(skuName);
        sb.append(", skuDesc=").append(skuDesc);
        sb.append(", weight=").append(weight);
        sb.append(", tmId=").append(tmId);
        sb.append(", catalog3Id=").append(catalog3Id);
        sb.append(", skuDefaultImg=").append(skuDefaultImg);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}