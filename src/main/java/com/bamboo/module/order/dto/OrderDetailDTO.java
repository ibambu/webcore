/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bamboo.module.order.dto;

import com.bamboo.module.order.beans.OrderDetail;
import com.bamboo.module.order.beans.OrderPrice;

/**
 *
 * @author luotao
 */
public class OrderDetailDTO {

    private OrderDetail orderDetail;
    private OrderPrice orderPrice;

    private ProductInstDTO productInst;

    public OrderPrice getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(OrderPrice orderPrice) {
        this.orderPrice = orderPrice;
    }

    public OrderDetail getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(OrderDetail orderDetail) {
        this.orderDetail = orderDetail;
    }

    public ProductInstDTO getProductInst() {
        return productInst;
    }

    public void setProductInst(ProductInstDTO productInst) {
        this.productInst = productInst;
    }


}
