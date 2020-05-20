package com.patterns.decorator;

import com.patterns.base.BikeInterface;
import com.patterns.java.BikeColor;

public class LeatherSeatOption extends AbstractBikeOption {

    public LeatherSeatOption(BikeInterface bike) {
        super(bike, bike.getColor());
    }
    @Override
    public float getPrice() {
        return decoratedBike.getPrice() + 40.00F;
    }

}
