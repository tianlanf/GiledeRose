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
        BackStagePass pass = new BackStagePass(8, 10);
        pass.oneDayLater();
        assertEquals(7, pass.getSellin());
        assertEquals(12, pass.getQuality());
    }
}
