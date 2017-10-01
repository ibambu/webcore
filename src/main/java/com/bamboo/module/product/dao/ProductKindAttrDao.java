package com.bamboo.module.product.dao;

import com.bamboo.module.product.beans.ProductKindAttr;
import com.bamboo.module.product.beans.ProductKindAttrExample;
import com.bamboo.module.product.beans.ProductKindAttrKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductKindAttrDao {

    long countByExample(ProductKindAttrExample example);

    int deleteByExample(ProductKindAttrExample example);

    int deleteByPrimaryKey(ProductKindAttrKey key);

    int insert(ProductKindAttr record);

    int insertSelective(ProductKindAttr record);

    List<ProductKindAttr> selectByExample(ProductKindAttrExample example);

    List<ProductKindAttr> selectByProductId(Integer prodctId);

    ProductKindAttr selectByPrimaryKey(ProductKindAttrKey key);

    int updateByExampleSelective(@Param("record") ProductKindAttr record, @Param("example") ProductKindAttrExample example);

    int updateByExample(@Param("record") ProductKindAttr record, @Param("example") ProductKindAttrExample example);

    int updateByPrimaryKeySelective(ProductKindAttr record);

    int updateByPrimaryKey(ProductKindAttr record);
}
