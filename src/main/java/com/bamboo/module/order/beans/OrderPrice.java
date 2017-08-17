package com.bamboo.module.order.beans;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class OrderPrice implements Serializable {
    /**
     * 订单明细ID
     */
    private String orderDetailId;

    /**
     * 订单ID
     */
    private String orderId;

    /**
     * 订单明细价格
     */
    private BigDecimal price;

    /**
     * 调整金额，如果是减免则填写负数。
     */
    private BigDecimal priceReduced;

    /**
     * 备注
     */
    private String remark;

    /**
     * 变更时间
     */
    private Date changeTime;

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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPriceReduced() {
        return priceReduced;
    }

    public void setPriceReduced(BigDecimal priceReduced) {
        this.priceReduced = priceReduced;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getChangeTime() {
        return changeTime;
    }

    public void setChangeTime(Date changeTime) {
        this.changeTime = changeTime;
    }
}