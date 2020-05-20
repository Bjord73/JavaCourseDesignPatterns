package com.patterns.builder;

import com.patterns.base.BikeInterface;

public class RoadBikeDirector extends AbstractBikeDirector {

    @Override
    public BikeInterface build(AbstractBikeBuilder builder) {
        builder.buildHandleBars();
        builder.buildStreetTires();
        return builder.getBike();
    }
}
