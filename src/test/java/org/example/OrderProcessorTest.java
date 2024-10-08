package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class OrderProcessorTest {

    @Test
    void calculateTotalPrice() {
        //given
        ProductRepository productRepository = mock(ProductRepository.class);
        Product productA = new Product(1, "Product A", 25);
        Product productB = new Product(2, "Product B", 18);
        Product productC = new Product(3, "Product C", 21);
        OrderProcessor orderProcessor = new OrderProcessor();


        //when


        //then

    }
}