package com.patterns.builder;

import com.patterns.base.AbstractMountainBike;
import com.patterns.base.BikeInterface;

public class MoutainBikeBuilder extends AbstractBikeBuilder{
    private AbstractMountainBike bikeInProgress;

    public MoutainBikeBuilder(AbstractMountainBike bike) {
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
    public void buildWideTires() {
        System.out.println("Build Wide Tires");
    }

    
}
