package com.patterns.decorator;

import com.patterns.base.AbstractBike;
import com.patterns.base.BikeInterface;
import com.patterns.java.BikeColor;

public abstract class AbstractBikeOption extends AbstractBike {
    protected BikeInterface decoratedBike;

    public AbstractBikeOption(BikeInterface bike) {
        super(bike.getWheel());
        this.decoratedBike = bike;
    }

    public AbstractBikeOption(BikeInterface bike, BikeColor color) {
        super(bike.getWheel(), color);
        this.decoratedBike = bike;
    }

    @Override
    public String toString() {
        String info = super.toString();
        return decoratedBike.getClass().getSimpleName() + "with" + info;
    }

}
