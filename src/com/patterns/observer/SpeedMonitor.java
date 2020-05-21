package com.patterns.observer;

import java.util.Observable;
import java.util.Observer;

public class SpeedMonitor implements Observer {
    public static final int SPEED_TO_ALERT = 30;

    @Override
    public void update(Observable obs, Object arg) {
        Speedometer speedo = (Speedometer) obs;
        if(speedo.getCurrentSpeed() > SPEED_TO_ALERT) {
            System.out.println("*** ALERT *** You are riding to fast(" +
                    speedo.getCurrentSpeed()+ ")");
        } else {
            System.out.println("... Nice and Steady ... (" +
                    speedo.getCurrentSpeed()+ ")");
        }
    }
}
