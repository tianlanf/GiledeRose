package com.tw;

public class BackStagePass extends Product {
    public BackStagePass(int sellin, int quality) {
        super(sellin, quality);
    }

    @Override
    public void oneDayLater() {
        sellin--;
        if (sellin < 0) {
            quality = 0;
            return;
        }
        if (sellin < 5) {
            quality += 3;
        } else if (sellin < 10){
            quality += 2;
        } else {
            quality++;
        }

        if (quality > 50) {
            quality = 50;
        }
    }
}
