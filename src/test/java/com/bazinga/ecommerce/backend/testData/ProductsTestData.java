package com.bazinga.ecommerce.backend.testData;

import com.bazinga.ecommerce.backend.model.Product;

import java.util.Arrays;
import java.util.List;

public class ProductsTestData {
    public static List<Product> getProductMockData() {
        return Arrays.asList(new Product(1, "product1", 10, 10, "product1.png"),
                new Product(2, "product2", 10, 10, "product2.png"));
    }
}
