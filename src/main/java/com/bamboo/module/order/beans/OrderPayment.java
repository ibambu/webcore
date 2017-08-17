package com.bamboo.module.order.beans;

import java.io.Serializable;
import java.util.Date;

/**
 * @author
 */
public class OrderPayment extends OrderPaymentKey implements Serializable {

    private Integer payMethod;

    private String payAcctId;

    /**
     * 支付时间
     */
    private Date payedTime;

    private static final long serialVersionUID = 1L;

    public Integer getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(Integer payMethod) {
        this.payMethod = payMethod;
    }

    public String getPayAcctId() {
        return payAcctId;
    }

    public void setPayAcctId(String payAcctId) {
        this.payAcctId = payAcctId;
    }

    public Date getPayedTime() {
        return payedTime;
    }

    public void setPayedTime(Date payedTime) {
        this.payedTime = payedTime;
    }
}
