package com.bamboo.module.product.dao;

import com.bamboo.module.product.beans.ProductSaleAttr;
import com.bamboo.module.product.beans.ProductSaleAttrExample;
import com.bamboo.module.product.beans.ProductSaleAttrKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductSaleAttrDao {
    long countByExample(ProductSaleAttrExample example);

    int deleteByExample(ProductSaleAttrExample example);

    int deleteByPrimaryKey(ProductSaleAttrKey key);

    int insert(ProductSaleAttr record);

    int insertSelective(ProductSaleAttr record);

    List<ProductSaleAttr> selectByExample(ProductSaleAttrExample example);

    ProductSaleAttr selectByPrimaryKey(ProductSaleAttrKey key);

    int updateByExampleSelective(@Param("record") ProductSaleAttr record, @Param("example") ProductSaleAttrExample example);

    int updateByExample(@Param("record") ProductSaleAttr record, @Param("example") ProductSaleAttrExample example);

    int updateByPrimaryKeySelective(ProductSaleAttr record);

    int updateByPrimaryKey(ProductSaleAttr record);
}