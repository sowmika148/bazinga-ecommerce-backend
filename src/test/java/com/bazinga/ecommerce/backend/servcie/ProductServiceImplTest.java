package com.bazinga.ecommerce.backend.servcie;

import com.bazinga.ecommerce.backend.dao.ProductDao;
import com.bazinga.ecommerce.backend.model.Product;
import com.bazinga.ecommerce.backend.service.ProductService;
import com.bazinga.ecommerce.backend.service.ProductServiceImpl;
import com.bazinga.ecommerce.backend.testData.ProductsTestData;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ProductServiceImplTest {

    @Mock
    private ProductDao productDao;

    private ProductService productService;

    @Before
    public void setUp() {
        productService = new ProductServiceImpl(productDao);
    }

    @Test
    public void shouldGetAllProducts() {
        List<Product> productsMockData = ProductsTestData.getProductMockData();
        when(productDao.findAll()).thenReturn(productsMockData);
        List<Product> products = productService.getAllProducts();

        assertArrayEquals(products.toArray(), productsMockData.toArray());
        verify(productDao, times(1)).findAll();
    }
}
