package com.patterns.builder;

import com.patterns.base.BikeInterface;

public abstract class AbstractBikeDirector {
    public abstract BikeInterface build(AbstractBikeBuilder builder);
}
