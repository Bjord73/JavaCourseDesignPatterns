package com.patterns.base;

import com.patterns.java.BikeColor;

/* This class goes over the Down Hill Bike */
public class DownHill extends AbstractMountainBike {

    public DownHill(WheelInterface wheel, BikeColor color) {
        super(wheel, color);
    }

    public DownHill(WheelInterface wheel) {
        this(wheel, BikeColor.GREEN);
    }

    @Override
    public float getPrice() {
        return 870.00f;
    }
}
