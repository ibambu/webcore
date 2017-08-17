package com.bamboo.module.order.beans;

import java.io.Serializable;

/**
 * @author
 */
public class OrderPaymentKey implements Serializable {

    private String orderId;

    /**
     * 支付类型： 1：支付 0：退款
     */
    private Integer payType;

    private static final long serialVersionUID = 1L;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }
}
