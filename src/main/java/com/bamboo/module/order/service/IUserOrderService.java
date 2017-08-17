/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bamboo.module.order.service;

import com.bamboo.module.order.beans.OrderPayment;
import com.bamboo.module.order.dto.UserOrderDTO;

/**
 *
 * @author luotao
 */
public interface IUserOrderService {

    /**
     * 创建订单
     *
     * @param userOrder
     * @return
     */
    public int createUserOrder(UserOrderDTO userOrder);

    /**
     * 更新订单状态
     *
     * @param state
     * @param orderId
     * @return
     */
    public int updateUserOrderState(int state, String orderId);

    /**
     * 检查订单
     *
     * @param orderId
     * @return
     */
    public int checkUserOrder(String orderId);

    /**
     * 支付订单
     *
     * @param orderPayment
     * @return
     */
    public int payUserOrder(OrderPayment orderPayment);

    /**
     * 取消订单(如果订单已经支付,可能涉及退款操作.)
     *
     * @param orderId
     * @return
     */
    public int cancelUserOrder(String orderId);

    /**
     * 关闭无效订单(无效订单包括未支付订单或者过期等).
     *
     * @param orderId
     * @return
     */
    public int colseUserOrder(String orderId);

}
