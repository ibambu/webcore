/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bamboo.module.order.service.impl;

import com.bamboo.module.order.beans.OrderDetail;
import com.bamboo.module.order.beans.OrderPayment;
import com.bamboo.module.order.beans.OrderPrice;
import com.bamboo.module.order.beans.ProductInst;
import com.bamboo.module.order.beans.ProductInstAttr;
import com.bamboo.module.order.beans.UserOrder;
import com.bamboo.module.order.dao.OrderDetailDao;
import com.bamboo.module.order.dao.OrderPriceDao;
import com.bamboo.module.order.dao.ProductInstAttrDao;
import com.bamboo.module.order.dao.ProductInstDao;
import com.bamboo.module.order.dao.UserOrderDao;
import com.bamboo.module.order.dto.OrderDetailDTO;
import com.bamboo.module.order.dto.ProductInstDTO;
import com.bamboo.module.order.dto.UserOrderDTO;
import com.bamboo.module.order.service.IUserOrderService;
import java.math.BigDecimal;
import java.util.List;
import javax.annotation.Resource;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

/**
 *
 * @author luotao
 */
@Service
public class UserOrderServiceImpl implements IUserOrderService {

    Logger logger = Logger.getLogger(UserOrderServiceImpl.class.getName());

    @Resource
    private UserOrderDao userOrderDao;

    @Resource
    private OrderDetailDao orderDetailDao;

    @Resource
    private ProductInstDao productInstDao;

    @Resource
    private ProductInstAttrDao productInstAttrDao;

    @Resource
    private OrderPriceDao orderPriceDao;

    @Override
    public int createUserOrder(UserOrderDTO userOrder) {
        int retCode = -1;
        try {
            /**
             * 保存订单明细信息
             */
            BigDecimal priceTotal = BigDecimal.ZERO;
            List<OrderDetailDTO> orderDetails = userOrder.getOrderDetails();
            String orderId = "";//通过数据库序列生成
            for (OrderDetailDTO orderDetailDto : orderDetails) {
                String orderDetailId = "";//通过数据库序列生成
                String productInstId = "";//通过数据库序列生成
                OrderDetail orderDetail = orderDetailDto.getOrderDetail();
                orderDetail.setOrderId(orderId);
                orderDetail.setOrderDetailId(orderDetailId);
                orderDetail.setPrdctInstId(productInstId);
                orderDetailDao.insert(orderDetail);
                /**
                 * 保存产品实例信息
                 */
                ProductInstDTO productInstDto = orderDetailDto.getProductInst();
                ProductInst productInst = productInstDto.getProductInst();
                productInst.setPrdctInstId(productInstId);
                productInstDao.insert(productInst);
                /**
                 * 保存产品属性信息
                 */
                List<ProductInstAttr> productInstAttrs = productInstDto.getProuctInstAttrs();
                for (ProductInstAttr productInstAttr : productInstAttrs) {
                    productInstAttr.setPrdctInstId(productInstId);
                    productInstAttrDao.insert(productInstAttr);
                }
                /**
                 * 保存订单明细价格
                 */
                OrderPrice orderPrice = orderDetailDto.getOrderPrice();
                orderPrice.setOrderDetailId(orderDetailId);
                orderPriceDao.insert(orderPrice);
                priceTotal = priceTotal.add(orderPrice.getPrice());//即使订单总金额

            }
            /**
             * 保存订单基本信息
             */
            UserOrder order = userOrder.getUserOrder();
            order.setOrderId(orderId);
            order.setAmount(priceTotal);//赋值订单总价格
            userOrderDao.insert(order);
            retCode = 1;
            /**
             * 订单保存成功后,减库存.
             */
            
        } catch (Exception ex) {
            logger.error("createUserOrder method error!", ex);
            throw ex;
        }
        return retCode;
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
