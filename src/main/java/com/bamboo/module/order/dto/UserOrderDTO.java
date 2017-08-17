/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bamboo.module.order.dto;

import com.bamboo.module.order.beans.UserOrder;
import java.util.List;

/**
 *
 * @author luotao
 */
public class UserOrderDTO {

    private UserOrder userOrder;
    private List<OrderDetailDTO> orderDetails;

    public UserOrder getUserOrder() {
        return userOrder;
    }

    public void setUserOrder(UserOrder userOrder) {
        this.userOrder = userOrder;
    }

    public List<OrderDetailDTO> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetailDTO> orderDetails) {
        this.orderDetails = orderDetails;
    }

}
