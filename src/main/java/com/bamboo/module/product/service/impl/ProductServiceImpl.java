/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bamboo.module.product.service.impl;

import com.bamboo.module.product.beans.Product;
import com.bamboo.module.product.beans.ProductKind;
import com.bamboo.module.product.beans.ProductKindAttr;
import com.bamboo.module.product.beans.ProductSale;
import com.bamboo.module.product.beans.ProductSaleAttr;
import com.bamboo.module.product.beans.ProductSaleAttrExample;
import com.bamboo.module.product.beans.ProductSalePhoto;
import com.bamboo.module.product.beans.ProductSalePhotoExample;
import com.bamboo.module.product.dao.ProductDao;
import com.bamboo.module.product.dao.ProductKindAttrDao;
import com.bamboo.module.product.dao.ProductKindDao;
import com.bamboo.module.product.dao.ProductSaleAttrDao;
import com.bamboo.module.product.dao.ProductSaleDao;
import com.bamboo.module.product.dao.ProductSalePhotoDao;
import com.bamboo.module.product.dto.ProductDTO;
import com.bamboo.module.product.service.IProductService;
import java.util.List;
import javax.annotation.Resource;

/**
 *
 * @author luotao
 */
public class ProductServiceImpl implements IProductService {

    @Resource
    private ProductDao productDao;

    @Resource
    private ProductKindDao productKindDao;

    @Resource
    private ProductKindAttrDao productKindAttrDao;

    @Resource
    private ProductSaleDao productSaleDao;

    @Resource
    private ProductSalePhotoDao productSalePhotoDao;

    @Resource
    private ProductSaleAttrDao productSaleAttrDao;

    @Override
    public ProductDTO queryProductByIdWithExtends(Integer productId) {
        ProductDTO productDto = new ProductDTO();

        Product product = productDao.selectByPrimaryKey(productId);
        productDto.setProduct(product);

        ProductSale productSale = productSaleDao.selectByPrimaryKey(productId);
        productDto.setProductSale(productSale);

        List<ProductKindAttr> productKindAttrs = productKindAttrDao.selectByProductId(productId);
        productDto.setProductKindAttrs(productKindAttrs);

        if (productKindAttrs != null && !productKindAttrs.isEmpty()) {
            ProductKind productKind = new ProductKind();
            productKind.setKindId(productKindAttrs.get(0).getKindId());
        }

        ProductSalePhotoExample photoExample = new ProductSalePhotoExample();
        photoExample.createCriteria().andImgGroupIdEqualTo(productId);
        List<ProductSalePhoto> productSalePhotoes = productSalePhotoDao.selectByExample(photoExample);
        productDto.setProductSalePhotoes(productSalePhotoes);

        ProductSaleAttrExample saleAttrExamplel = new ProductSaleAttrExample();
        saleAttrExamplel.createCriteria().andPrdctIdEqualTo(productId);
        List<ProductSaleAttr> productSaleAttrs = productSaleAttrDao.selectByExample(saleAttrExamplel);
        productDto.setProductSaleAttrs(productSaleAttrs);

        return productDto;

    }

    @Override
    public Product queryProductById(Integer productId) {
        return productDao.selectByPrimaryKey(productId);
    }

    @Override
    public List<ProductDTO> queryProductsByKindWithExtends(Integer productKindId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Product> queryProductsByKind(Integer productKindId) {
        return productDao.selectByProductKind(productKindId);
    }

    @Override
    public List<Product> queryProductsByName(String productName) {
        return productDao.selectByProductName(productName);
    }

    @Override
    public List<ProductDTO> queryProductsByNameWithExtends(String productName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
