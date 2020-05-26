package com.tw;

public class BackStagePass extends Product {
    public BackStagePass(int sellin, int quality) {
        super(sellin, quality);
    }

    @Override
    public void oneDayLater() {
        sellin--;
        quality++;
    }
}
