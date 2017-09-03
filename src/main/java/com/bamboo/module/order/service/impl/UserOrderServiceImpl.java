/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bamboo.module.order.service.impl;

import com.bamboo.constants.SeqConstants;
import com.bamboo.module.db.sequence.service.ISequenceService;
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
import com.bamboo.module.order.dto.PurchasedProductDTO;
import com.bamboo.module.order.dto.ShoppingCartDTO;
import com.bamboo.module.order.dto.UserOrderDTO;
import com.bamboo.module.order.service.IUserOrderService;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

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

    @Resource
    private ISequenceService sequenceService;

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


    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = {RuntimeException.class, Exception.class})
    public int createOrderFromShoppingCart(ShoppingCartDTO shoppingCart) {
        int retCode = -1;//默认值未失败
        String orderId = sequenceService.getSequence(SeqConstants.ORDER_ID_SEQ);//通过序列生成
        BigDecimal amount = BigDecimal.ZERO;
        try {
            List<PurchasedProductDTO> purchasedProducts = shoppingCart.getPurchasedProducts();
            int purchasedNum = purchasedProducts.size();
            List<String> orderDetailIds = sequenceService.getSomeSequence(SeqConstants.ORDER_DETAIL_SEQ, purchasedNum, true);
            List<String> productInstIds = sequenceService.getSomeSequence(SeqConstants.PRODUCT_INST_ID, purchasedNum, true);
            List<OrderDetail> orderDetails = new ArrayList(purchasedNum);//订单明细集合
            List<ProductInst> productInsts = new ArrayList(purchasedNum);//产品实例集合
            List<ProductInstAttr> salseAttrs = new ArrayList();//产品实例集合
            purchasedProducts.forEach((purchasedProduct) -> {
                String orderDetailId = orderDetailIds.remove(0);
                String productInstId = productInstIds.remove(0);
                /**
                 * 创建订单明细对象
                 */
                OrderDetail orderDetail = new OrderDetail();
                orderDetail.setOrderId(orderId);
                orderDetail.setOrderDetailId(orderDetailId);
                orderDetail.setPrdctInstId(productInstId);
                orderDetail.setQuantity(purchasedProduct.getQuantity());
                orderDetails.add(orderDetail);
                /**
                 * 创建产品实例对象
                 */
                ProductInst productInst = new ProductInst();
                productInst.setPrdctId(purchasedProduct.getProductId());
                productInst.setPrdctInstId(productInstId);
                productInsts.add(productInst);
                /**
                 * 创建产品实例销售属性对象
                 */
                List<ProductInstAttr> salesAttrs = purchasedProduct.getSalesAttrs();
                salesAttrs.stream().map((attr) -> {
                    attr.setPrdctInstId(productInstId);
                    return attr;
                }).forEachOrdered((attr) -> {
                    salseAttrs.add(attr);
                });
            });
            /**
             * 创建用户订单
             */
            UserOrder order = new UserOrder();
            order.setOrderId(orderId);
            order.setUserId(shoppingCart.getUserId());
            order.setStatusCd("10");
            order.setPayedFlag(0);
            order.setAmount(amount);

            /**
             * 开始保存订单数据
             */
            userOrderDao.insert(order);//用户订单
            orderDetails.forEach((orderDetail) -> {
                orderDetailDao.insert(orderDetail);//订单明细
            });
            productInsts.forEach((productInst) -> {
                productInstDao.insert(productInst);//产品实例
            });
            salseAttrs.forEach((instAttr) -> {
                productInstAttrDao.insert(instAttr);//销售属性
            });
            retCode = 1;
        } catch (Exception e) {
            logger.error(retCode, e);
            throw e;
        }
        return retCode;
    }

}
