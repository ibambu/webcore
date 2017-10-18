/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bamboo.module.product.service.impl;

import com.bamboo.module.product.beans.Product;
import com.bamboo.module.product.dto.ProductDTO;
import com.bamboo.module.product.service.IProductService;
import com.bamboo.module.test.BaseTest;
import java.util.List;
import javax.annotation.Resource;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author luotao
 */

public class ProductServiceImplTest extends BaseTest{
    
    @Resource
    private IProductService productService;
    public ProductServiceImplTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of queryProductByIdWithExtends method, of class ProductServiceImpl.
     */
    @Test
    public void testQueryProductByIdWithExtends() {
        System.out.println("queryProductByIdWithExtends");
        Integer productId = 1001;
        ProductDTO expResult = null;
        ProductDTO result = productService.queryProductByIdWithExtends(productId);
        System.out.println("qqqqq:"+result.getProduct().getProductName());
        System.out.println("qqqqq:"+result.getProductSale().getSalePrice()+" "+result.getProductSale().getSaleDesc());
    }

    /**
     * Test of queryProductById method, of class ProductServiceImpl.
     */
    @Test
    public void testQueryProductById() {
        System.out.println("queryProductById");
        Integer productId = 1001;
        Product expResult = new Product();expResult.setProductId(productId);
        
        Product result = productService.queryProductById(productId);
        System.out.println(result.getProductId()+" "+result.getProductName());
        
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of queryProductsByKindWithExtends method, of class ProductServiceImpl.
     */
    @Test
    public void testQueryProductsByKindWithExtends() {
//        System.out.println("queryProductsByKindWithExtends");
//        Integer productKindId = null;
//        ProductServiceImpl instance = new ProductServiceImpl();
//        List<ProductDTO> expResult = null;
//        List<ProductDTO> result = instance.queryProductsByKindWithExtends(productKindId);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of queryProductsByKind method, of class ProductServiceImpl.
     */
    @Test
    public void testQueryProductsByKind() {
//        System.out.println("queryProductsByKind");
//        Integer productKindId = null;
//        ProductServiceImpl instance = new ProductServiceImpl();
//        List<Product> expResult = null;
//        List<Product> result = instance.queryProductsByKind(productKindId);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of queryProductsByName method, of class ProductServiceImpl.
     */
    @Test
    public void testQueryProductsByName() {
        System.out.println("queryProductsByName");
        String productName = "内衣";
        List<Product> expResult = null;
        List<Product> result = productService.queryProductsByName(productName);
        System.out.println("aaaaaaaaaa:"+result.size());
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of queryProductsByNameWithExtends method, of class ProductServiceImpl.
     */
    @Test
    public void testQueryProductsByNameWithExtends() {
//        System.out.println("queryProductsByNameWithExtends");
//        String productName = "";
//        ProductServiceImpl instance = new ProductServiceImpl();
//        List<ProductDTO> expResult = null;
//        List<ProductDTO> result = instance.queryProductsByNameWithExtends(productName);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
