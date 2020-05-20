package com.patterns.facade;

import com.patterns.base.BikeInterface;

public class Documentation {
    public static void printBrochure(BikeInterface bike) {
        System.out.println(bike.getClass().getSimpleName() + " Brochure Printing"); }
    }

