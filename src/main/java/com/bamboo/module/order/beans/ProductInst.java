package com.bamboo.module.order.beans;

import java.io.Serializable;

/**
 * @author 
 */
public class ProductInst implements Serializable {
    /**
     * 产品实例ID
     */
    private String prdctInstId;

    /**
     * 产品ID
     */
    private String prdctId;

    private static final long serialVersionUID = 1L;

    public String getPrdctInstId() {
        return prdctInstId;
    }

    public void setPrdctInstId(String prdctInstId) {
        this.prdctInstId = prdctInstId;
    }

    public String getPrdctId() {
        return prdctId;
    }

    public void setPrdctId(String prdctId) {
        this.prdctId = prdctId;
    }
}