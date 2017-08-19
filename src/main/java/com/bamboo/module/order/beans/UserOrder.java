package com.bamboo.module.order.beans;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author
 */
public class UserOrder implements Serializable {

    /**
     * 订单ID
     */
    private String orderId;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 订单状态 0：配货 1：出库 2：已发货 3：已收货 4：退订 5：完成
     */
    private String statusCd;

    /**
     * 支付标识 0：未支付 1：已支付 2：已退款
     */
    private Integer payedFlag;

    /**
     * 订单变更时间
     */
    private Date changeTime;

    /**
     * 订单总价格
     */
    private BigDecimal amount;

    private static final long serialVersionUID = 1L;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getStatusCd() {
        return statusCd;
    }

    public void setStatusCd(String statusCd) {
        this.statusCd = statusCd;
    }

    public Integer getPayedFlag() {
        return payedFlag;
    }

    public void setPayedFlag(Integer payedFlag) {
        this.payedFlag = payedFlag;
    }

    public Date getChangeTime() {
        return changeTime;
    }

    public void setChangeTime(Date changeTime) {
        this.changeTime = changeTime;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
