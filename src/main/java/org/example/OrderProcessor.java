package org.example;

import java.util.ArrayList;
import java.util.List;

public class OrderProcessor {


    private List<Product> order = new ArrayList<Product>();
    private ProductRepository productRepository;

    public OrderProcessor(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void addProductToOrderList(int id){
        Product product = productRepository.findProductByID(id);
        order.add(product);
    }

    public double calculateTotalPrice(){
        double total = 0;
        for (Product product : order){
            total += product.getPrice();
        }
      return total;
    }

}
