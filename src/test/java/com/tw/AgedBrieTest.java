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
}
