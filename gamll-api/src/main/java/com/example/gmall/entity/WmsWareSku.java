package com.example.gmall.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "wms_ware_sku")
public class WmsWareSku implements Serializable {
    /**
     * 编号
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * skuid
     */
    @Column(name = "sku_id")
    private Long skuId;

    /**
     * 仓库id
     */
    @Column(name = "warehouse_id")
    private Long warehouseId;

    /**
     * 库存数
     */
    @Column(name = "stock")
    private Integer stock;

    /**
     * 存货名称
     */
    @Column(name = "stock_name")
    private String stockName;

    @Column(name = "stock_locked")
    private Integer stockLocked;

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
     * 获取skuid
     *
     * @return sku_id - skuid
     */
    public Long getSkuId() {
        return skuId;
    }

    /**
     * 设置skuid
     *
     * @param skuId skuid
     */
    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    /**
     * 获取仓库id
     *
     * @return warehouse_id - 仓库id
     */
    public Long getWarehouseId() {
        return warehouseId;
    }

    /**
     * 设置仓库id
     *
     * @param warehouseId 仓库id
     */
    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
    }

    /**
     * 获取库存数
     *
     * @return stock - 库存数
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * 设置库存数
     *
     * @param stock 库存数
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * 获取存货名称
     *
     * @return stock_name - 存货名称
     */
    public String getStockName() {
        return stockName;
    }

    /**
     * 设置存货名称
     *
     * @param stockName 存货名称
     */
    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    /**
     * @return stock_locked
     */
    public Integer getStockLocked() {
        return stockLocked;
    }

    /**
     * @param stockLocked
     */
    public void setStockLocked(Integer stockLocked) {
        this.stockLocked = stockLocked;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", skuId=").append(skuId);
        sb.append(", warehouseId=").append(warehouseId);
        sb.append(", stock=").append(stock);
        sb.append(", stockName=").append(stockName);
        sb.append(", stockLocked=").append(stockLocked);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}