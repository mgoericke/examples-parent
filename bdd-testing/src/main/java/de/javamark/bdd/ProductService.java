package de.javamark.bdd;

import de.javamark.bdd.model.Product;

public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product getProduct(String name) {
        return productRepository.findByName(name);
    }
}
