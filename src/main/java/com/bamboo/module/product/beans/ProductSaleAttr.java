package com.bamboo.module.product.beans;

import java.io.Serializable;

/**
 * @author 
 */
public class ProductSaleAttr extends ProductSaleAttrKey implements Serializable {
    /**
     * 属性类型
     */
    private Integer attrType;

    /**
     * 属性名称
     */
    private String attrName;

    /**
     * 属性值
     */
    private String attrValue;

    private static final long serialVersionUID = 1L;

    public Integer getAttrType() {
        return attrType;
    }

    public void setAttrType(Integer attrType) {
        this.attrType = attrType;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public String getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
    }
}