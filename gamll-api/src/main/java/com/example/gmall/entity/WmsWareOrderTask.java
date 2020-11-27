package com.example.gmall.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "wms_ware_order_task")
public class WmsWareOrderTask implements Serializable {
    /**
     * 编号
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 订单编号
     */
    @Column(name = "order_id")
    private Long orderId;

    /**
     * 收货人
     */
    @Column(name = "consignee")
    private String consignee;

    /**
     * 收货人电话
     */
    @Column(name = "consignee_tel")
    private String consigneeTel;

    /**
     * 送货地址
     */
    @Column(name = "delivery_address")
    private String deliveryAddress;

    /**
     * 订单备注
     */
    @Column(name = "order_comment")
    private String orderComment;

    /**
     * 付款方式 1:在线付款 2:货到付款
     */
    @Column(name = "payment_way")
    private String paymentWay;

    @Column(name = "task_status")
    private String taskStatus;

    /**
     * 订单描述
     */
    @Column(name = "order_body")
    private String orderBody;

    /**
     * 物流单号
     */
    @Column(name = "tracking_no")
    private String trackingNo;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 仓库编号
     */
    @Column(name = "ware_id")
    private Long wareId;

    /**
     * 工作单备注
     */
    @Column(name = "task_comment")
    private String taskComment;

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
     * 获取订单编号
     *
     * @return order_id - 订单编号
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * 设置订单编号
     *
     * @param orderId 订单编号
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取收货人
     *
     * @return consignee - 收货人
     */
    public String getConsignee() {
        return consignee;
    }

    /**
     * 设置收货人
     *
     * @param consignee 收货人
     */
    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    /**
     * 获取收货人电话
     *
     * @return consignee_tel - 收货人电话
     */
    public String getConsigneeTel() {
        return consigneeTel;
    }

    /**
     * 设置收货人电话
     *
     * @param consigneeTel 收货人电话
     */
    public void setConsigneeTel(String consigneeTel) {
        this.consigneeTel = consigneeTel;
    }

    /**
     * 获取送货地址
     *
     * @return delivery_address - 送货地址
     */
    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    /**
     * 设置送货地址
     *
     * @param deliveryAddress 送货地址
     */
    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    /**
     * 获取订单备注
     *
     * @return order_comment - 订单备注
     */
    public String getOrderComment() {
        return orderComment;
    }

    /**
     * 设置订单备注
     *
     * @param orderComment 订单备注
     */
    public void setOrderComment(String orderComment) {
        this.orderComment = orderComment;
    }

    /**
     * 获取付款方式 1:在线付款 2:货到付款
     *
     * @return payment_way - 付款方式 1:在线付款 2:货到付款
     */
    public String getPaymentWay() {
        return paymentWay;
    }

    /**
     * 设置付款方式 1:在线付款 2:货到付款
     *
     * @param paymentWay 付款方式 1:在线付款 2:货到付款
     */
    public void setPaymentWay(String paymentWay) {
        this.paymentWay = paymentWay;
    }

    /**
     * @return task_status
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    /**
     * @param taskStatus
     */
    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    /**
     * 获取订单描述
     *
     * @return order_body - 订单描述
     */
    public String getOrderBody() {
        return orderBody;
    }

    /**
     * 设置订单描述
     *
     * @param orderBody 订单描述
     */
    public void setOrderBody(String orderBody) {
        this.orderBody = orderBody;
    }

    /**
     * 获取物流单号
     *
     * @return tracking_no - 物流单号
     */
    public String getTrackingNo() {
        return trackingNo;
    }

    /**
     * 设置物流单号
     *
     * @param trackingNo 物流单号
     */
    public void setTrackingNo(String trackingNo) {
        this.trackingNo = trackingNo;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取仓库编号
     *
     * @return ware_id - 仓库编号
     */
    public Long getWareId() {
        return wareId;
    }

    /**
     * 设置仓库编号
     *
     * @param wareId 仓库编号
     */
    public void setWareId(Long wareId) {
        this.wareId = wareId;
    }

    /**
     * 获取工作单备注
     *
     * @return task_comment - 工作单备注
     */
    public String getTaskComment() {
        return taskComment;
    }

    /**
     * 设置工作单备注
     *
     * @param taskComment 工作单备注
     */
    public void setTaskComment(String taskComment) {
        this.taskComment = taskComment;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderId=").append(orderId);
        sb.append(", consignee=").append(consignee);
        sb.append(", consigneeTel=").append(consigneeTel);
        sb.append(", deliveryAddress=").append(deliveryAddress);
        sb.append(", orderComment=").append(orderComment);
        sb.append(", paymentWay=").append(paymentWay);
        sb.append(", taskStatus=").append(taskStatus);
        sb.append(", orderBody=").append(orderBody);
        sb.append(", trackingNo=").append(trackingNo);
        sb.append(", createTime=").append(createTime);
        sb.append(", wareId=").append(wareId);
        sb.append(", taskComment=").append(taskComment);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}