package com.tw;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BackStagePassTest {
    @Test
    public void shouldPlusQualityBy1WhenSellinIsLargerThan10() {
        BackStagePass pass = new BackStagePass(15, 10);
        pass.oneDayLater();
        assertEquals(14, pass.getSellin());
        assertEquals(11, pass.getQuality());
    }

    @Test
    public void shouldPlusQualityBy2WhenSellinIsLargerThan5AndLessThan11() {
        BackStagePass pass = new BackStagePass(10, 10);
        pass.oneDayLater();
        assertEquals(9, pass.getSellin());
        assertEquals(12, pass.getQuality());
    }

    @Test
    public void shouldPlusQualityBy2WhenSellinIsLessThan5() {
        BackStagePass pass = new BackStagePass(5, 10);
        pass.oneDayLater();
        assertEquals(4, pass.getSellin());
        assertEquals(13, pass.getQuality());
    }

    @Test
    public void shouldDropToZeroAfterExpiration() {
        BackStagePass pass = new BackStagePass(0, 10);
        pass.oneDayLater();
        assertEquals(-1, pass.getSellin());
        assertEquals(0, pass.getQuality());
    }
}
