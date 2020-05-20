package com.patterns.singleton;

public class SerialNumberGenerator {
    private static SerialNumberGenerator instance;

    private int count = 654320 ;

    private SerialNumberGenerator() { }

    public synchronized static SerialNumberGenerator getInstance() {
        if(instance == null) {
            instance = new SerialNumberGenerator();
        }
        return instance;
    }
    public synchronized int getNextSerial() { return ++count; }
}
