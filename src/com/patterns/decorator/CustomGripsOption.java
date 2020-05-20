package com.patterns.decorator;

import com.patterns.base.BikeInterface;

public class CustomGripsOption extends AbstractBikeOption {

    public CustomGripsOption(BikeInterface bike) {
        super(bike, bike.getColor()); }

    @Override
    public float getPrice() {
        return decoratedBike.getPrice() + 20.00f;
    }
}
