package com.tw;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProductTest {
    @Test
    public void shouldMinusSellinAndQualityBy1WhenItComesToNextDay() {
        Product product = new Product(10, 1);
        product.oneDayLater();
        assertEquals(9, product.getSellin());
        assertEquals(0, product.getQuality());
    }

    @Test
    public void shouldRemain0WhenProductQualityAlreadyComesTo0() {
        Product product = new Product(9, 0);
        product.oneDayLater();
        assertEquals(8, product.getSellin());
        assertEquals(0, product.getQuality());
    }

    @Test
    public void shouldMinusQualityBy2WhenExceedsExpirationDay() {
        Product product = new Product(0, 10);
        product.oneDayLater();
        assertEquals(-1, product.getSellin());
        assertEquals(8, product.getQuality());
    }

    @Test
    public void shouldMinusQualityBy1WhenExceedsExpirationDayAndQualityIs1() {
        Product product = new Product(0, 1);
        product.oneDayLater();
        assertEquals(-1, product.getSellin());
        assertEquals(0, product.getQuality());
    }

    @Test
    public void shouldNotMinusQualityWhenExceedsExpirationDayAndQualityIs0() {
        Product product = new Product(0, 0);
        product.oneDayLater();
        assertEquals(-1, product.getSellin());
        assertEquals(0, product.getQuality());
    }
}
