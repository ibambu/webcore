package com.bamboo.module.order.beans;

import java.io.Serializable;

/**
 * @author 
 */
public class ProductInstAttr extends ProductInstAttrKey implements Serializable {
    /**
     * 属性值
     */
    private String attrValue;

    private static final long serialVersionUID = 1L;

    public String getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
    }
}