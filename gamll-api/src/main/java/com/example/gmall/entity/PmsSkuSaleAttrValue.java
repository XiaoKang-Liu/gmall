package com.example.gmall.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "pms_sku_sale_attr_value")
public class PmsSkuSaleAttrValue implements Serializable {
    /**
     * id
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 库存单元id
     */
    @Column(name = "sku_id")
    private Long skuId;

    /**
     * 销售属性id（冗余)
     */
    @Column(name = "sale_attr_id")
    private Long saleAttrId;

    /**
     * 销售属性值id
     */
    @Column(name = "sale_attr_value_id")
    private Long saleAttrValueId;

    /**
     * 销售属性名称(冗余)
     */
    @Column(name = "sale_attr_name")
    private String saleAttrName;

    /**
     * 销售属性值名称(冗余)
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
     * 获取库存单元id
     *
     * @return sku_id - 库存单元id
     */
    public Long getSkuId() {
        return skuId;
    }

    /**
     * 设置库存单元id
     *
     * @param skuId 库存单元id
     */
    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    /**
     * 获取销售属性id（冗余)
     *
     * @return sale_attr_id - 销售属性id（冗余)
     */
    public Long getSaleAttrId() {
        return saleAttrId;
    }

    /**
     * 设置销售属性id（冗余)
     *
     * @param saleAttrId 销售属性id（冗余)
     */
    public void setSaleAttrId(Long saleAttrId) {
        this.saleAttrId = saleAttrId;
    }

    /**
     * 获取销售属性值id
     *
     * @return sale_attr_value_id - 销售属性值id
     */
    public Long getSaleAttrValueId() {
        return saleAttrValueId;
    }

    /**
     * 设置销售属性值id
     *
     * @param saleAttrValueId 销售属性值id
     */
    public void setSaleAttrValueId(Long saleAttrValueId) {
        this.saleAttrValueId = saleAttrValueId;
    }

    /**
     * 获取销售属性名称(冗余)
     *
     * @return sale_attr_name - 销售属性名称(冗余)
     */
    public String getSaleAttrName() {
        return saleAttrName;
    }

    /**
     * 设置销售属性名称(冗余)
     *
     * @param saleAttrName 销售属性名称(冗余)
     */
    public void setSaleAttrName(String saleAttrName) {
        this.saleAttrName = saleAttrName;
    }

    /**
     * 获取销售属性值名称(冗余)
     *
     * @return sale_attr_value_name - 销售属性值名称(冗余)
     */
    public String getSaleAttrValueName() {
        return saleAttrValueName;
    }

    /**
     * 设置销售属性值名称(冗余)
     *
     * @param saleAttrValueName 销售属性值名称(冗余)
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
        sb.append(", skuId=").append(skuId);
        sb.append(", saleAttrId=").append(saleAttrId);
        sb.append(", saleAttrValueId=").append(saleAttrValueId);
        sb.append(", saleAttrName=").append(saleAttrName);
        sb.append(", saleAttrValueName=").append(saleAttrValueName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}