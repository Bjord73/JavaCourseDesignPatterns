package com.patterns.base;

import com.patterns.java.BikeColor;

/* This class goes over Cross Country Bike*/
public class CrossCountry extends AbstractMountainBike {

    public CrossCountry(WheelInterface wheel, BikeColor color) {
        super(wheel, color);
    }

    public CrossCountry(WheelInterface wheel) {
        this(wheel, BikeColor.ORANGE);
    }

    @Override
    public float getPrice() {
        return 850.00f;
    }
}

