package com.example.gmall.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "pms_base_sale_attr")
public class PmsBaseSaleAttr implements Serializable {
    /**
     * 编号
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 销售属性名称
     */
    @Column(name = "name")
    private String name;

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
     * 获取销售属性名称
     *
     * @return name - 销售属性名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置销售属性名称
     *
     * @param name 销售属性名称
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}