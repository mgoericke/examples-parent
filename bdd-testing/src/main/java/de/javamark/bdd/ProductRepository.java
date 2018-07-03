package de.javamark.bdd;

import de.javamark.bdd.model.Product;

public interface ProductRepository {
    Product findByName(String name);
}
