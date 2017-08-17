package com.bamboo.module.order.dao;

import com.bamboo.module.order.beans.OrderPrice;
import com.bamboo.module.order.beans.OrderPriceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderPriceDao {
    long countByExample(OrderPriceExample example);

    int deleteByExample(OrderPriceExample example);

    int deleteByPrimaryKey(String orderDetailId);

    int insert(OrderPrice record);

    int insertSelective(OrderPrice record);

    List<OrderPrice> selectByExample(OrderPriceExample example);

    OrderPrice selectByPrimaryKey(String orderDetailId);

    int updateByExampleSelective(@Param("record") OrderPrice record, @Param("example") OrderPriceExample example);

    int updateByExample(@Param("record") OrderPrice record, @Param("example") OrderPriceExample example);

    int updateByPrimaryKeySelective(OrderPrice record);

    int updateByPrimaryKey(OrderPrice record);
}