package com.tw;

public class Product {
    private int quality;
    private int sellin;

    public Product(int sellin, int quality) {
        this.sellin = sellin;
        this.quality = quality;
    }

    public void oneDayLater() {
        sellin--;
        quality--;
    }

    public int getSellin() {
        return sellin;
    }

    public int getQuality() {
        return quality;
    }
}
