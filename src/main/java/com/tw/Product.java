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
        if (quality == 0) {
            return;
        }
        if (sellin < 0 && quality > 1) {
            quality -= 2;
        } else  {
            quality--;
        }
    }

    public int getSellin() {
        return sellin;
    }

    public int getQuality() {
        return quality;
    }
}
