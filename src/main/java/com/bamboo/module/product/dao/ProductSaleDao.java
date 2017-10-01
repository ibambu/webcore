package com.bamboo.module.product.dao;

import com.bamboo.module.product.beans.ProductSale;
import com.bamboo.module.product.beans.ProductSaleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductSaleDao {
    long countByExample(ProductSaleExample example);

    int deleteByExample(ProductSaleExample example);

    int deleteByPrimaryKey(Integer productId);

    int insert(ProductSale record);

    int insertSelective(ProductSale record);

    List<ProductSale> selectByExample(ProductSaleExample example);

    ProductSale selectByPrimaryKey(Integer productId);

    int updateByExampleSelective(@Param("record") ProductSale record, @Param("example") ProductSaleExample example);

    int updateByExample(@Param("record") ProductSale record, @Param("example") ProductSaleExample example);

    int updateByPrimaryKeySelective(ProductSale record);

    int updateByPrimaryKey(ProductSale record);
}