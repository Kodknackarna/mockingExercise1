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
        Product productA = new Product(1, "Product A", 25.0);
        Product productB = new Product(2, "Product B", 18.0);
        Product productC = new Product(3, "Product C", 21.0);
        OrderProcessor orderProcessor = new OrderProcessor(productRepository);
        when(productRepository.findProductByID(1)).thenReturn(productA);
        when(productRepository.findProductByID(2)).thenReturn(productB);
        when(productRepository.findProductByID(3)).thenReturn(productC);
        orderProcessor.addProductToOrderList(1);
        orderProcessor.addProductToOrderList(2);
        orderProcessor.addProductToOrderList(3);


        //when
        Double total = orderProcessor.calculateTotalPrice();

        //then
        assertEquals(64.0, total);
    }
}