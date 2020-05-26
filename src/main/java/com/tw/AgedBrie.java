package com.tw;

public class AgedBrie extends Product {
    public AgedBrie(int sellin, int quality) {
        super(sellin, quality);
    }

    @Override
    public void oneDayLater() {
        sellin--;
        quality++;
    }
}
