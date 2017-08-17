package com.bamboo.module.order.dao;

import com.bamboo.module.order.beans.ProductInst;
import com.bamboo.module.order.beans.ProductInstExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductInstDao {
    long countByExample(ProductInstExample example);

    int deleteByExample(ProductInstExample example);

    int deleteByPrimaryKey(String prdctInstId);

    int insert(ProductInst record);

    int insertSelective(ProductInst record);

    List<ProductInst> selectByExample(ProductInstExample example);

    ProductInst selectByPrimaryKey(String prdctInstId);

    int updateByExampleSelective(@Param("record") ProductInst record, @Param("example") ProductInstExample example);

    int updateByExample(@Param("record") ProductInst record, @Param("example") ProductInstExample example);

    int updateByPrimaryKeySelective(ProductInst record);

    int updateByPrimaryKey(ProductInst record);
}