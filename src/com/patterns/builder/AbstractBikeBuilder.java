package com.patterns.builder;

import com.patterns.base.BikeInterface;

public abstract class AbstractBikeBuilder {
    public abstract BikeInterface getBike();
    public abstract void buildHandleBars();

    public void buildStreetTires() { }
    public void buildWideTires() { }


}
