package com.bamboo.module.product.beans;

import java.io.Serializable;

/**
 * @author 
 */
public class ProductSalePhotoKey implements Serializable {
    private Integer imgGroupId;

    private Integer imgId;

    private static final long serialVersionUID = 1L;

    public Integer getImgGroupId() {
        return imgGroupId;
    }

    public void setImgGroupId(Integer imgGroupId) {
        this.imgGroupId = imgGroupId;
    }

    public Integer getImgId() {
        return imgId;
    }

    public void setImgId(Integer imgId) {
        this.imgId = imgId;
    }
}