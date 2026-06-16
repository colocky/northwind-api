package com.northwind.northwind_api.service;
import com.northwind.northwind_api.model.Product;
import com.northwind.northwind_api.repository.ProductRepository;
import org.springframework.stereotype.Service;
import com.northwind.northwind_api.model.Product;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(Integer productId) {
        return productRepository.findById(productId);
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public boolean deleteProduct(Integer productId) {
        if(productRepository.existsById(productId)) {
            productRepository.deleteById(productId);
            return true;
        }
        return false;
    }
}
