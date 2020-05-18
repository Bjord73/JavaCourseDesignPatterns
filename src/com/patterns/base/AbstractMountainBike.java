package com.patterns.base;

import com.patterns.java.BikeColor;

/* This parent class will work with Mountain Bikes */
public abstract class AbstractMountainBike extends AbstractBike {

    protected AbstractMountainBike(WheelInterface wheel, BikeColor color) {
    super(wheel, color);
    }

    protected AbstractMountainBike(WheelInterface wheel) {
        this(wheel, BikeColor.CHROME);
    }
}