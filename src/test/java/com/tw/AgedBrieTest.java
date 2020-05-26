package com.tw;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AgedBrieTest {
    @Test
    public void shouldPlusQualityWhenItComesToNextDay() {
        AgedBrie agedBrie = new AgedBrie(10, 10);
        agedBrie.oneDayLater();
        assertEquals(9, agedBrie.getSellin());
        assertEquals(11, agedBrie.getQuality());
    }

    @Test
    public void shouldPlusQualityAfterExpiration() {
        AgedBrie agedBrie = new AgedBrie(0, 10);
        agedBrie.oneDayLater();
        assertEquals(-1, agedBrie.getSellin());
        assertEquals(11, agedBrie.getQuality());
    }
}
