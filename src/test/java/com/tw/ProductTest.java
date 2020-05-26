package com.tw;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProductTest {
    @Test
    public void shouldMinusSellinAndQualityByOneWhenItComesToNextDay() {
        Product product = new Product(10, 1);
        product.oneDayLater();
        assertEquals(9, product.getSellin());
        assertEquals(0, product.getQuality());
    }
}
