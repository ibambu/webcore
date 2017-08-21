/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bamboo.module.order.dto;

import java.util.List;

/**
 * 购物车对象
 * @author luotao
 */
public class ShoppingCartDTO {

    private String userId;//用户标识
    private List<PurchasedProductDTO> purchasedProducts;//购买的产品集

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<PurchasedProductDTO> getPurchasedProducts() {
        return purchasedProducts;
    }

    public void setPurchasedProducts(List<PurchasedProductDTO> purchasedProducts) {
        this.purchasedProducts = purchasedProducts;
    }

}
