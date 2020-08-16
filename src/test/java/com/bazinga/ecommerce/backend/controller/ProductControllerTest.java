package com.bazinga.ecommerce.backend.controller;

import com.bazinga.ecommerce.backend.api.ProductResponse;
import com.bazinga.ecommerce.backend.model.Product;
import com.bazinga.ecommerce.backend.service.ProductService;
import com.bazinga.ecommerce.backend.testData.ProductsTestData;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ProductControllerTest {

    @Mock
    private ProductService productService;

    private ProductController productController;

    @Before
    public void setUp() {
        productController = new ProductController(productService);
    }

    @Test
    public void shouldGetAllProducts() {
        List<Product> productsMockData = ProductsTestData.getProductMockData();
        when(productService.getAllProducts()).thenReturn(productsMockData);
        ResponseEntity<ProductResponse> productsResponse = productController.getAllProducts();

        assert (productsResponse.getStatusCode()).equals(HttpStatus.OK);
        assertEquals(productsResponse.getBody(), new ProductResponse(productsMockData));
        verify(productService, times(1)).getAllProducts();
    }
}
