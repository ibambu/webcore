package com.bamboo.module.product.dao;

import com.bamboo.module.product.beans.Product;
import com.bamboo.module.product.beans.ProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductDao {

    long countByExample(ProductExample example);

    int deleteByExample(ProductExample example);

    int deleteByPrimaryKey(Integer productId);

    int insert(Product record);

    int insertSelective(Product record);

    List<Product> selectByExample(ProductExample example);

    List<Product> selectByProductKind(Integer productKindId);

    List<Product> selectByProductName(String productName);

    Product selectByPrimaryKey(Integer productId);

    int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);
}
