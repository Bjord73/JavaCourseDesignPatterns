package com.patterns.abstractfactory;

public class RoadFrame implements BikeFrameInterface {
    @Override
    public String getFrameParts() {
        return "Frame parts of the Road Bike.";
    }
}
