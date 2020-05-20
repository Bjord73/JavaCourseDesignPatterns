package com.patterns.abstractfactory;

public class RoadBikeFactory extends AbstractBikeFactory {
    @Override
    public BikeFrameInterface createFrame() {
    return new RoadFrame();
}

    @Override
    public BikeSeatInterface createSeat() {
        return new RoadSeat();
    }
}