package com.bamboo.module.product.beans;

import java.io.Serializable;

/**
 * @author 
 */
public class ProductSale implements Serializable {
    /**
     * 产品标识
     */
    private Integer productId;

    /**
     * 单价：元
     */
    private Long salePrice;

    /**
     * 产品销售时的描述信息
     */
    private String saleDesc;

    /**
     * 产品销售时的图片地址
     */
    private Integer imgGroupId;

    private static final long serialVersionUID = 1L;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Long getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Long salePrice) {
        this.salePrice = salePrice;
    }

    public String getSaleDesc() {
        return saleDesc;
    }

    public void setSaleDesc(String saleDesc) {
        this.saleDesc = saleDesc;
    }

    public Integer getImgGroupId() {
        return imgGroupId;
    }

    public void setImgGroupId(Integer imgGroupId) {
        this.imgGroupId = imgGroupId;
    }
}