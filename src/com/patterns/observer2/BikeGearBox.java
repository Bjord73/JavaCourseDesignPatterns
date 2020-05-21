package com.patterns.observer2;

import com.patterns.observer.Speedometer;

import java.util.Observable;

public class BikeGearBox implements SpeedometerListener {
    @Override
    public void speedChange(SpeedometerEvent event) {
            if (event.getSpeed() <= 5) {
                System.out.println("Now in easy gear");
            } else if (event.getSpeed() <= 10) {
                System.out.println("Now in 2nd gear");
            } else if (event.getSpeed() <= 15) {
                System.out.println("Now in 3rd gear");
            } else if (event.getSpeed() <= 20) {
                System.out.println("Now in 4th gear");
            } else if (event.getSpeed() <= 30) {
                System.out.println("Now in 5th gear");
            }
    }
}
