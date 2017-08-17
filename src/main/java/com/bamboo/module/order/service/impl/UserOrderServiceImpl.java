/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bamboo.module.order.service.impl;

import com.bamboo.module.order.beans.OrderPayment;
import com.bamboo.module.order.dto.UserOrderDTO;
import com.bamboo.module.order.service.IUserOrderService;
import org.springframework.stereotype.Service;

/**
 *
 * @author luotao
 */
@Service
public class UserOrderServiceImpl implements IUserOrderService {

    @Override
    public int createUserOrder(UserOrderDTO userOrder) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int updateUserOrderState(int state, String orderId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int checkUserOrder(String orderId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int payUserOrder(OrderPayment orderPayment) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int cancelUserOrder(String orderId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int colseUserOrder(String orderId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
