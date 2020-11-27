package com.example.gmall.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "pms_product_sale_attr_value")
public class PmsProductSaleAttrValue implements Serializable {
    /**
     * id
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
     * 销售属性id
     */
    @Column(name = "sale_attr_id")
    private Long saleAttrId;

    /**
     * 销售属性值名称
     */
    @Column(name = "sale_attr_value_name")
    private String saleAttrValueName;

    private static final long serialVersionUID = 1L;

    /**
     * 获取id
     *
     * @return id - id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
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
     * 获取销售属性id
     *
     * @return sale_attr_id - 销售属性id
     */
    public Long getSaleAttrId() {
        return saleAttrId;
    }

    /**
     * 设置销售属性id
     *
     * @param saleAttrId 销售属性id
     */
    public void setSaleAttrId(Long saleAttrId) {
        this.saleAttrId = saleAttrId;
    }

    /**
     * 获取销售属性值名称
     *
     * @return sale_attr_value_name - 销售属性值名称
     */
    public String getSaleAttrValueName() {
        return saleAttrValueName;
    }

    /**
     * 设置销售属性值名称
     *
     * @param saleAttrValueName 销售属性值名称
     */
    public void setSaleAttrValueName(String saleAttrValueName) {
        this.saleAttrValueName = saleAttrValueName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productId=").append(productId);
        sb.append(", saleAttrId=").append(saleAttrId);
        sb.append(", saleAttrValueName=").append(saleAttrValueName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}