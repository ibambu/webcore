package com.bamboo.module.product.beans;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class Product implements Serializable {
    /**
     * 产品标识
     */
    private Integer productId;

    /**
     * 产品名称
     */
    private String productName;

    /**
     * 产品描述
     */
    private String productDesc;

    /**
     * 价格(出厂参考价）
     */
    private BigDecimal price;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 状态
     */
    private String statusCd;

    private static final long serialVersionUID = 1L;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getStatusCd() {
        return statusCd;
    }

    public void setStatusCd(String statusCd) {
        this.statusCd = statusCd;
    }
}