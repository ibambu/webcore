/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bamboo.module.order.dto;

import com.bamboo.module.order.beans.ProductInstAttr;
import java.math.BigDecimal;
import java.util.List;

/**
 * 购买的产品对象
 *
 * @author luotao
 */
public class PurchasedProductDTO {

    private String productId;//产品标识
    private int quantity;//数量
    private BigDecimal price;//单价
    private List<ProductInstAttr> salesAttrs;//产品销售属性,如颜色,尺寸等等.

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public List<ProductInstAttr> getSalesAttrs() {
        return salesAttrs;
    }

    public void setSalesAttrs(List<ProductInstAttr> salesAttrs) {
        this.salesAttrs = salesAttrs;
    }

}
