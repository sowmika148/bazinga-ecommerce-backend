package com.bazinga.ecommerce.backend.controller;

import com.bazinga.ecommerce.backend.api.ProductResponse;
import com.bazinga.ecommerce.backend.model.Product;
import com.bazinga.ecommerce.backend.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    @GetMapping
    public ResponseEntity<ProductResponse> getAllProducts() {
        List<Product> products = productService.getAllProducts();
        return new ResponseEntity<>(new ProductResponse(products), HttpStatus.OK);
    }

}
