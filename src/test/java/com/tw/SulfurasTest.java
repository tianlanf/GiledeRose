package com.tw;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SulfurasTest {
    @Test
    public void shouldRemainUnchangedWithTimeGoesBy() {
        Sulfuras sulfuras = new Sulfuras(10, 10);
        sulfuras.oneDayLater();
        assertEquals(9, sulfuras.getSellin());
        assertEquals(10, sulfuras.getQuality());
    }
}
