package com.bamboo.module.product.dao;

import com.bamboo.module.product.beans.ProductSalePhoto;
import com.bamboo.module.product.beans.ProductSalePhotoExample;
import com.bamboo.module.product.beans.ProductSalePhotoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductSalePhotoDao {
    long countByExample(ProductSalePhotoExample example);

    int deleteByExample(ProductSalePhotoExample example);

    int deleteByPrimaryKey(ProductSalePhotoKey key);

    int insert(ProductSalePhoto record);

    int insertSelective(ProductSalePhoto record);

    List<ProductSalePhoto> selectByExample(ProductSalePhotoExample example);

    ProductSalePhoto selectByPrimaryKey(ProductSalePhotoKey key);

    int updateByExampleSelective(@Param("record") ProductSalePhoto record, @Param("example") ProductSalePhotoExample example);

    int updateByExample(@Param("record") ProductSalePhoto record, @Param("example") ProductSalePhotoExample example);

    int updateByPrimaryKeySelective(ProductSalePhoto record);

    int updateByPrimaryKey(ProductSalePhoto record);
}