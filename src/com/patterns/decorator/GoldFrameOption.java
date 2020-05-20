package com.patterns.decorator;

import com.patterns.base.BikeInterface;
import com.patterns.java.BikeColor;

public class GoldFrameOption extends AbstractBikeOption {

    public GoldFrameOption(BikeInterface bike) {
        super(bike, BikeColor.GOLD);
    }


    @Override
    public float getPrice() {
        return decoratedBike.getPrice() + 300.00F;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " (" +getWheel() + ", Gold Frame price = "+
                getPrice() + ")";
    }
}
