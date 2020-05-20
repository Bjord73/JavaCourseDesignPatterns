package com.patterns.decorator;

import com.patterns.base.BikeInterface;
import com.patterns.java.BikeColor;

public class WhiteTireOption extends AbstractBikeOption {

    public WhiteTireOption(BikeInterface bike) { super(bike, BikeColor.GOLD); }

    @Override
    public float getPrice() {
        return decoratedBike.getPrice() + 80.00f;
    }

}
