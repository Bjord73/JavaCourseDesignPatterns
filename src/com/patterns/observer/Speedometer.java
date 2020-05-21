package com.patterns.observer;

import java.util.Observable;

public class Speedometer extends Observable {
    private int currentSpeed;

    public Speedometer() { currentSpeed = 0; }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;

        setChanged();
        notifyObservers();
    }
}
