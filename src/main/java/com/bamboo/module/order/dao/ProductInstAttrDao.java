package com.bamboo.module.order.dao;

import com.bamboo.module.order.beans.ProductInstAttr;
import com.bamboo.module.order.beans.ProductInstAttrExample;
import com.bamboo.module.order.beans.ProductInstAttrKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductInstAttrDao {
    long countByExample(ProductInstAttrExample example);

    int deleteByExample(ProductInstAttrExample example);

    int deleteByPrimaryKey(ProductInstAttrKey key);

    int insert(ProductInstAttr record);

    int insertSelective(ProductInstAttr record);

    List<ProductInstAttr> selectByExample(ProductInstAttrExample example);

    ProductInstAttr selectByPrimaryKey(ProductInstAttrKey key);

    int updateByExampleSelective(@Param("record") ProductInstAttr record, @Param("example") ProductInstAttrExample example);

    int updateByExample(@Param("record") ProductInstAttr record, @Param("example") ProductInstAttrExample example);

    int updateByPrimaryKeySelective(ProductInstAttr record);

    int updateByPrimaryKey(ProductInstAttr record);
}