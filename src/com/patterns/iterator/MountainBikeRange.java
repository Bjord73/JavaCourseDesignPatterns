package com.patterns.iterator;

import com.patterns.base.BikeInterface;
import com.patterns.base.CrossCountry;
import com.patterns.base.DownHill;
import com.patterns.base.WideWheel;

import java.util.Arrays;
import java.util.Iterator;

public class MountainBikeRange implements Iterable<BikeInterface> {
    private BikeInterface[] bikes;

    public MountainBikeRange() {
        bikes = new BikeInterface[6];

        bikes[0] = new DownHill(new WideWheel(22));
        bikes[1] = new DownHill(new WideWheel(24));
        bikes[2] = new DownHill(new WideWheel(26));
        bikes[3] = new CrossCountry(new WideWheel(24));
        bikes[4] = new CrossCountry(new WideWheel(26));
        bikes[5] = new CrossCountry(new WideWheel(28));
    }

    public BikeInterface[] getRange() {
        return bikes;
    }

    @Override
    public Iterator<BikeInterface> iterator() {
        return Arrays.asList(bikes).listIterator();
    }
}
