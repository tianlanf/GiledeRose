package com.tw;

public class Sulfuras extends Product {
    public Sulfuras(int sellin, int quality) {
        super(sellin, quality);
    }

    @Override
    public void oneDayLater() {
        sellin--;
    }
}
