package com.bamboo.module.order.beans;

import java.io.Serializable;

/**
 * @author 
 */
public class OrderDetail implements Serializable {
    /**
     * 订单明细ID
     */
    private String orderDetailId;

    /**
     * 订单ID
     */
    private String orderId;

    /**
     * 产品实例ID
     */
    private String prdctInstId;

    /**
     * 购买数量
     */
    private Integer quantity;

    /**
     * 创建时间
     */
    private String createTime;

    private static final long serialVersionUID = 1L;


    public String getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(String orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getPrdctInstId() {
        return prdctInstId;
    }

    public void setPrdctInstId(String prdctInstId) {
        this.prdctInstId = prdctInstId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}