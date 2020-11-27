package com.example.gmall.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "payment_info")
public class PaymentInfo implements Serializable {
    /**
     * 编号
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 对外业务编号
     */
    @Column(name = "order_sn")
    private String orderSn;

    /**
     * 订单编号
     */
    @Column(name = "order_id")
    private String orderId;

    /**
     * 支付宝交易编号
     */
    @Column(name = "alipay_trade_no")
    private String alipayTradeNo;

    /**
     * 支付金额
     */
    @Column(name = "total_amount")
    private BigDecimal totalAmount;

    /**
     * 交易内容
     */
    @Column(name = "subject")
    private String subject;

    /**
     * 支付状态
     */
    @Column(name = "payment_status")
    private String paymentStatus;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 创建时间
     */
    @Column(name = "confirm_time")
    private Date confirmTime;

    /**
     * 回调信息
     */
    @Column(name = "callback_content")
    private String callbackContent;

    @Column(name = "callback_time")
    private Date callbackTime;

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
     * 获取对外业务编号
     *
     * @return order_sn - 对外业务编号
     */
    public String getOrderSn() {
        return orderSn;
    }

    /**
     * 设置对外业务编号
     *
     * @param orderSn 对外业务编号
     */
    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    /**
     * 获取订单编号
     *
     * @return order_id - 订单编号
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置订单编号
     *
     * @param orderId 订单编号
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取支付宝交易编号
     *
     * @return alipay_trade_no - 支付宝交易编号
     */
    public String getAlipayTradeNo() {
        return alipayTradeNo;
    }

    /**
     * 设置支付宝交易编号
     *
     * @param alipayTradeNo 支付宝交易编号
     */
    public void setAlipayTradeNo(String alipayTradeNo) {
        this.alipayTradeNo = alipayTradeNo;
    }

    /**
     * 获取支付金额
     *
     * @return total_amount - 支付金额
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * 设置支付金额
     *
     * @param totalAmount 支付金额
     */
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * 获取交易内容
     *
     * @return subject - 交易内容
     */
    public String getSubject() {
        return subject;
    }

    /**
     * 设置交易内容
     *
     * @param subject 交易内容
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * 获取支付状态
     *
     * @return payment_status - 支付状态
     */
    public String getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * 设置支付状态
     *
     * @param paymentStatus 支付状态
     */
    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
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
     * 获取创建时间
     *
     * @return confirm_time - 创建时间
     */
    public Date getConfirmTime() {
        return confirmTime;
    }

    /**
     * 设置创建时间
     *
     * @param confirmTime 创建时间
     */
    public void setConfirmTime(Date confirmTime) {
        this.confirmTime = confirmTime;
    }

    /**
     * 获取回调信息
     *
     * @return callback_content - 回调信息
     */
    public String getCallbackContent() {
        return callbackContent;
    }

    /**
     * 设置回调信息
     *
     * @param callbackContent 回调信息
     */
    public void setCallbackContent(String callbackContent) {
        this.callbackContent = callbackContent;
    }

    /**
     * @return callback_time
     */
    public Date getCallbackTime() {
        return callbackTime;
    }

    /**
     * @param callbackTime
     */
    public void setCallbackTime(Date callbackTime) {
        this.callbackTime = callbackTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderSn=").append(orderSn);
        sb.append(", orderId=").append(orderId);
        sb.append(", alipayTradeNo=").append(alipayTradeNo);
        sb.append(", totalAmount=").append(totalAmount);
        sb.append(", subject=").append(subject);
        sb.append(", paymentStatus=").append(paymentStatus);
        sb.append(", createTime=").append(createTime);
        sb.append(", confirmTime=").append(confirmTime);
        sb.append(", callbackContent=").append(callbackContent);
        sb.append(", callbackTime=").append(callbackTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}