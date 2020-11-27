package com.example.gmall.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Table(name = "pms_base_catalog1")
public class PmsBaseCatalog1 implements Serializable {
    /**
     * 编号
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 分类名称
     */
    @Column(name = "name")
    private String name;

    @Transient
    private List<PmsBaseCatalog2> catalog2List;

    private static final long serialVersionUID = 1L;

    /**
     * 获取编号
     *
     * @return id - 编号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置编号
     *
     * @param id 编号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取分类名称
     *
     * @return name - 分类名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置分类名称
     *
     * @param name 分类名称
     */
    public void setName(String name) {
        this.name = name;
    }

    public List<PmsBaseCatalog2> getCatalog2List() {
        return catalog2List;
    }

    public void setCatalog2List(List<PmsBaseCatalog2> catalog2List) {
        this.catalog2List = catalog2List;
    }

    @Override
    public String toString() {
        return "PmsBaseCatalog1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", catalog2List=" + catalog2List +
                '}';
    }
}