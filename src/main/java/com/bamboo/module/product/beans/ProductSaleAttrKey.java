package com.bamboo.module.product.beans;

import java.io.Serializable;

/**
 * @author 
 */
public class ProductSaleAttrKey implements Serializable {
    /**
     * 属性标识
     */
    private Integer attrId;

    /**
     * 产品标识
     */
    private Integer prdctId;

    private static final long serialVersionUID = 1L;

    public Integer getAttrId() {
        return attrId;
    }

    public void setAttrId(Integer attrId) {
        this.attrId = attrId;
    }

    public Integer getPrdctId() {
        return prdctId;
    }

    public void setPrdctId(Integer prdctId) {
        this.prdctId = prdctId;
    }
}