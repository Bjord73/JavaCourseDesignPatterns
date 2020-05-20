package com.patterns.abstractfactory;

public abstract class BikeFactory {
    abstract BikeSeatInterface createFrame();
    abstract BikeSeatInterface createSeat();
}
