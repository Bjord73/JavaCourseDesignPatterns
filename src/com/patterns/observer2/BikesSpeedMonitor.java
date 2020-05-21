package com.patterns.observer2;

public class BikesSpeedMonitor implements SpeedometerListener {
    public static final int SPEED_TO_ALERT = 30;

    @Override
    public void speedChange(SpeedometerEvent event) {
        if(event.getSpeed() > SPEED_TO_ALERT) {
            System.out.println("*** ALERT *** You are riding to fast(" +
                    event.getSpeed()+ ")");
        } else {
            System.out.println("... Nice and Steady ... (" +
                    event.getSpeed()+ ")");
        }
    }
}
