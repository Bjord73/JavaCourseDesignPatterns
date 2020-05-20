package com.patterns.facade;

import com.patterns.base.BikeInterface;

public class BikeFacade {

    public void prepareForSale(BikeInterface bike) {
        Registration reg = new Registration( bike);
        reg.allocatingBikeNumber();
        Documentation.printBrochure(bike);
        bike.cleanFrame();
        bike.airTires();
        bike.testRide();
    }

}
