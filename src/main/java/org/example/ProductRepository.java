package org.example;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    private List<Product> products = new ArrayList<>();
    public ProductRepository() {
        products.add(new Product(1, "Block", 25.0));
        products.add(new Product(2, "Penna", 5.0));
        products.add(new Product(3, "Kalender", 99.0));
    }


    public Product findProductByID(int id) {
        Product product = null;
        //hittepåkod med loop
        return product;
    }
}
