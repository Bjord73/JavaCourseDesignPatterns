package com.patterns.base;

import com.patterns.java.BikeColor;

/* This class goes over the Touring Bike */
public class Touring extends AbstractRoadBike {

    public Touring(WheelInterface wheel, BikeColor color) {
        super(wheel, color);
    }

    public Touring(WheelInterface wheel) {
        this(wheel, BikeColor.BLUE);
    }

    @Override
    public  float getPrice() {
        return 570.00f;
    }
}
