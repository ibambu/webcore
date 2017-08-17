package com.bamboo.module.order.dao;

import com.bamboo.module.order.beans.OrderPayment;
import com.bamboo.module.order.beans.OrderPaymentExample;
import com.bamboo.module.order.beans.OrderPaymentKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderPaymentDao {
    long countByExample(OrderPaymentExample example);

    int deleteByExample(OrderPaymentExample example);

    int deleteByPrimaryKey(OrderPaymentKey key);

    int insert(OrderPayment record);

    int insertSelective(OrderPayment record);

    List<OrderPayment> selectByExample(OrderPaymentExample example);

    OrderPayment selectByPrimaryKey(OrderPaymentKey key);

    int updateByExampleSelective(@Param("record") OrderPayment record, @Param("example") OrderPaymentExample example);

    int updateByExample(@Param("record") OrderPayment record, @Param("example") OrderPaymentExample example);

    int updateByPrimaryKeySelective(OrderPayment record);

    int updateByPrimaryKey(OrderPayment record);
}