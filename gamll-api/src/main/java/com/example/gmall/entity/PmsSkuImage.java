package com.example.gmall.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "pms_sku_image")
public class PmsSkuImage implements Serializable {
    /**
     * 编号
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 商品id
     */
    @Column(name = "sku_id")
    private Long skuId;

    /**
     * 图片名称（冗余）
     */
    @Column(name = "img_name")
    private String imgName;

    /**
     * 图片路径(冗余)
     */
    @Column(name = "img_url")
    private String imgUrl;

    /**
     * 商品图片id
     */
    @Column(name = "product_img_id")
    private Long productImgId;

    /**
     * 是否默认
     */
    @Column(name = "is_default")
    private String isDefault;

    private static final long serialVersionUID = 1L;

    /**
     * 获取编号
     *
     * @return id - 编号
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置编号
     *
     * @param id 编号
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取商品id
     *
     * @return sku_id - 商品id
     */
    public Long getSkuId() {
        return skuId;
    }

    /**
     * 设置商品id
     *
     * @param skuId 商品id
     */
    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    /**
     * 获取图片名称（冗余）
     *
     * @return img_name - 图片名称（冗余）
     */
    public String getImgName() {
        return imgName;
    }

    /**
     * 设置图片名称（冗余）
     *
     * @param imgName 图片名称（冗余）
     */
    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    /**
     * 获取图片路径(冗余)
     *
     * @return img_url - 图片路径(冗余)
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * 设置图片路径(冗余)
     *
     * @param imgUrl 图片路径(冗余)
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    /**
     * 获取商品图片id
     *
     * @return product_img_id - 商品图片id
     */
    public Long getProductImgId() {
        return productImgId;
    }

    /**
     * 设置商品图片id
     *
     * @param productImgId 商品图片id
     */
    public void setProductImgId(Long productImgId) {
        this.productImgId = productImgId;
    }

    /**
     * 获取是否默认
     *
     * @return is_default - 是否默认
     */
    public String getIsDefault() {
        return isDefault;
    }

    /**
     * 设置是否默认
     *
     * @param isDefault 是否默认
     */
    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", skuId=").append(skuId);
        sb.append(", imgName=").append(imgName);
        sb.append(", imgUrl=").append(imgUrl);
        sb.append(", productImgId=").append(productImgId);
        sb.append(", isDefault=").append(isDefault);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}