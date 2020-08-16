package com.bazinga.ecommerce.backend.api;

import com.bazinga.ecommerce.backend.model.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {
    List<Product> products;
}
