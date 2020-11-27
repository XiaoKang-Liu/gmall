package com.example.gmall.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "pms_base_attr_info")
public class PmsBaseAttrInfo implements Serializable {
    /**
     * 编号
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 属性名称
     */
    @Column(name = "attr_name")
    private String attrName;

    @Column(name = "catalog3_id")
    private Long catalog3Id;

    /**
     * 启用：1 停用：0
     */
    @Column(name = "is_enabled")
    private String isEnabled;

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
     * 获取属性名称
     *
     * @return attr_name - 属性名称
     */
    public String getAttrName() {
        return attrName;
    }

    /**
     * 设置属性名称
     *
     * @param attrName 属性名称
     */
    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    /**
     * @return catalog3_id
     */
    public Long getCatalog3Id() {
        return catalog3Id;
    }

    /**
     * @param catalog3Id
     */
    public void setCatalog3Id(Long catalog3Id) {
        this.catalog3Id = catalog3Id;
    }

    /**
     * 获取启用：1 停用：0
     *
     * @return is_enabled - 启用：1 停用：0
     */
    public String getIsEnabled() {
        return isEnabled;
    }

    /**
     * 设置启用：1 停用：0
     *
     * @param isEnabled 启用：1 停用：0
     */
    public void setIsEnabled(String isEnabled) {
        this.isEnabled = isEnabled;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", attrName=").append(attrName);
        sb.append(", catalog3Id=").append(catalog3Id);
        sb.append(", isEnabled=").append(isEnabled);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}