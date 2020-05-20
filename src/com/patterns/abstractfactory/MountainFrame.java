package com.patterns.abstractfactory;

public class MountainFrame implements BikeFrameInterface{
    @Override
    public String getFrameParts() {
        return "Frame parts for the Mountain Bike.";
    }
}
