package com.bamboo.module.order.beans;

import java.io.Serializable;

/**
 * @author 
 */
public class ProductInstAttrKey implements Serializable {
    /**
     * 产品实例ID
     */
    private String prdctInstId;

    /**
     * 属性标识
     */
    private Integer attrId;

    private static final long serialVersionUID = 1L;

    public String getPrdctInstId() {
        return prdctInstId;
    }

    public void setPrdctInstId(String prdctInstId) {
        this.prdctInstId = prdctInstId;
    }

    public Integer getAttrId() {
        return attrId;
    }

    public void setAttrId(Integer attrId) {
        this.attrId = attrId;
    }
}