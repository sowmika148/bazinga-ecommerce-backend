package com.bazinga.ecommerce.backend.service;

import com.bazinga.ecommerce.backend.dao.ProductDao;
import com.bazinga.ecommerce.backend.model.Product;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private ProductDao productDao;

    @Override
    public List<Product> getAllProducts() {
        return productDao.findAll();
    }
}
