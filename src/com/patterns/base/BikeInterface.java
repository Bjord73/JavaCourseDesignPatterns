package com.patterns.base;

import com.patterns.java.BikeColor;

/* This interface serves the entire bike base
*  structure */
public interface BikeInterface {
    WheelInterface getWheel();

    BikeColor getColor();

    float getPrice();

    void paint(BikeColor color);
}
