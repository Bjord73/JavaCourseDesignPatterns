package com.patterns.facade;

import com.patterns.base.BikeInterface;
import com.patterns.singleton.SerialNumberGenerator;

public class Registration {

    private BikeInterface bike;

    Registration(BikeInterface bike) {
        this.bike = bike;
    }

    public void allocatingBikeNumber() {
        SerialNumberGenerator generator = SerialNumberGenerator.getInstance();
        System.out.println(bike.getClass().getSimpleName()+
                "Registration Number is " + generator.getNextSerial());
    }
    }
