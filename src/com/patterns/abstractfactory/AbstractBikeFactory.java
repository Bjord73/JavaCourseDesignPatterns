package com.patterns.abstractfactory;

public abstract class AbstractBikeFactory {
   public abstract BikeFrameInterface createFrame();
   public abstract BikeSeatInterface createSeat();
}
