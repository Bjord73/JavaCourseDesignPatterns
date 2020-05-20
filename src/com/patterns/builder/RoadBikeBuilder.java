package com.patterns.builder;

import com.patterns.base.AbstractRoadBike;
import com.patterns.base.BikeInterface;

public class RoadBikeBuilder extends AbstractBikeBuilder {

    private AbstractRoadBike bikeInProgress;

    public RoadBikeBuilder(AbstractRoadBike bike) {
        this.bikeInProgress = bike;
    }

    @Override
    public BikeInterface getBike() {
        return bikeInProgress;
    }

    @Override
    public void buildHandleBars() {
        System.out.println("Build Handle Bars");
    }

    @Override
    public void buildStreetTires() {
        System.out.println("Build Street Tire");
    }

}
