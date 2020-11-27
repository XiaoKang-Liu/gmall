package com.example.gmall.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "wms_ware_order_task_detail")
public class WmsWareOrderTaskDetail implements Serializable {
    /**
     * 编号
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * sku_id
     */
    @Column(name = "sku_id")
    private Long skuId;

    /**
     * sku名称
     */
    @Column(name = "sku_name")
    private String skuName;

    /**
     * 购买个数
     */
    @Column(name = "sku_nums")
    private Integer skuNums;

    /**
     * 工作单编号
     */
    @Column(name = "task_id")
    private Long taskId;

    @Column(name = "sku_num")
    private Integer skuNum;

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
     * 获取sku_id
     *
     * @return sku_id - sku_id
     */
    public Long getSkuId() {
        return skuId;
    }

    /**
     * 设置sku_id
     *
     * @param skuId sku_id
     */
    public void setSkuId(Long skuId) {
        this.skuId = skuId;
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
     * 获取购买个数
     *
     * @return sku_nums - 购买个数
     */
    public Integer getSkuNums() {
        return skuNums;
    }

    /**
     * 设置购买个数
     *
     * @param skuNums 购买个数
     */
    public void setSkuNums(Integer skuNums) {
        this.skuNums = skuNums;
    }

    /**
     * 获取工作单编号
     *
     * @return task_id - 工作单编号
     */
    public Long getTaskId() {
        return taskId;
    }

    /**
     * 设置工作单编号
     *
     * @param taskId 工作单编号
     */
    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    /**
     * @return sku_num
     */
    public Integer getSkuNum() {
        return skuNum;
    }

    /**
     * @param skuNum
     */
    public void setSkuNum(Integer skuNum) {
        this.skuNum = skuNum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", skuId=").append(skuId);
        sb.append(", skuName=").append(skuName);
        sb.append(", skuNums=").append(skuNums);
        sb.append(", taskId=").append(taskId);
        sb.append(", skuNum=").append(skuNum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}