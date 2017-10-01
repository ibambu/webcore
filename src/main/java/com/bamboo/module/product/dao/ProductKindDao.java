package com.bamboo.module.product.dao;

import com.bamboo.module.product.beans.ProductKind;
import com.bamboo.module.product.beans.ProductKindExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductKindDao {
    long countByExample(ProductKindExample example);

    int deleteByExample(ProductKindExample example);

    int deleteByPrimaryKey(Integer kindId);

    int insert(ProductKind record);

    int insertSelective(ProductKind record);

    List<ProductKind> selectByExample(ProductKindExample example);

    ProductKind selectByPrimaryKey(Integer kindId);

    int updateByExampleSelective(@Param("record") ProductKind record, @Param("example") ProductKindExample example);

    int updateByExample(@Param("record") ProductKind record, @Param("example") ProductKindExample example);

    int updateByPrimaryKeySelective(ProductKind record);

    int updateByPrimaryKey(ProductKind record);
}