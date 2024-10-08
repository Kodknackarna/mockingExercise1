package org.example;

public class ProductRepository {
    public ProductRepository() {}

    public Product findProductByID(int id) {
        //hittepåkod
        return new Product(id, "testprodukt", 25);
    }
}
