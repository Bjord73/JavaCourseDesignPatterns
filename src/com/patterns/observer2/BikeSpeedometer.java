package com.patterns.observer2;

import com.sun.deploy.net.MessageHeader;

import java.util.ArrayList;
import java.util.List;

public class BikeSpeedometer {
    private int currentSpeed;
    private List<SpeedometerListener> listener;

    public BikeSpeedometer() {
        currentSpeed = 0;
        listener = new ArrayList<>();
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
        fireSpeedChanged();
    }

    public int getCurrentSpeed() { return currentSpeed; }

    public void addSpeedometerListener(SpeedometerListener obj) {
        listener.add(obj);
    }

    public void removeSpeedometer(SpeedometerListener obj) {
        listener.remove(obj);
    }

    private void fireSpeedChanged() {
        SpeedometerEvent speedEvent = new SpeedometerEvent(this, getCurrentSpeed());
        for(SpeedometerListener listen : listener) {
            listen.speedChange(speedEvent);
        }
    }
}
