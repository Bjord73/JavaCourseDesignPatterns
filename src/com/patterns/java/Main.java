package com.patterns.java;

import com.patterns.abstractfactory.AbstractBikeFactory;
import com.patterns.abstractfactory.BikeFrameInterface;
import com.patterns.abstractfactory.BikeSeatInterface;
import com.patterns.abstractfactory.RoadBikeFactory;
import com.patterns.adapter.UltraWheel;
import com.patterns.adapter.UltraWheelAdapter;
import com.patterns.base.*;
import com.patterns.builder.AbstractBikeBuilder;
import com.patterns.builder.RoadBikeBuilder;
import com.patterns.builder.RoadBikeDirector;
import com.patterns.decorator.CustomGripsOption;
import com.patterns.decorator.GoldFrameOption;
import com.patterns.facade.BikeFacade;
import com.patterns.iterator.MountainBikeRange;
import com.patterns.iterator.RoadBikeRange;
import com.patterns.observer.GearBox;
import com.patterns.observer.SpeedMonitor;
import com.patterns.observer.Speedometer;
import com.patterns.observer2.BikeGearBox;
import com.patterns.observer2.BikeSpeedometer;
import com.patterns.observer2.BikesSpeedMonitor;
import com.patterns.singleton.SerialNumberGenerator;
import com.patterns.visitor.WheelDiagnostics;
import com.patterns.visitor.WheelInventory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        exampleVisitor();
        //exampleObserver2();
        //exampleObserver();
        //exampleIteratorV2();
        //exampleIterator();
        //exampleFacade();
        //exampleDecorator();
        //exampleAdapter();
        //exampleSingleton();
        //exampleBuilder();
        //exampleAbstractFactory();
    }

    public static void exampleVisitor() {
        WheelInterface wheel = new WideWheel(24);
        wheel.acceptVisitor(new WheelDiagnostics());
        wheel.acceptVisitor(new WheelInventory());
    }

    public static void exampleObserver2() {
        BikeSpeedometer speedo = new BikeSpeedometer();
        speedo.addSpeedometerListener(new BikesSpeedMonitor());
        speedo.addSpeedometerListener(new BikeGearBox());

        speedo.setCurrentSpeed(5);
        speedo.setCurrentSpeed(10);
        speedo.setCurrentSpeed(14);
        speedo.setCurrentSpeed(19);
        speedo.setCurrentSpeed(25);
        speedo.setCurrentSpeed(36);

    }

    public static void exampleObserver() {
        SpeedMonitor monitor = new SpeedMonitor();
        Speedometer speedo = new Speedometer();
        speedo.addObserver(monitor);
        speedo.addObserver(new GearBox());

        speedo.setCurrentSpeed(5);
        speedo.setCurrentSpeed(10);
        speedo.setCurrentSpeed(14);
        speedo.setCurrentSpeed(19);
        speedo.setCurrentSpeed(25);
        speedo.setCurrentSpeed(36);

    }

    public static void exampleIteratorV2() {
        System.out.println("=== Our Road Bikes ===");
        RoadBikeRange bikeRange = new RoadBikeRange();
        for(BikeInterface bike : bikeRange.getRange()) {
            System.out.println(bike);
    }

        System.out.println("=== Our Mountain Bikes ===");
        MountainBikeRange mountainBikeRange = new MountainBikeRange();
        for(BikeInterface mountain : mountainBikeRange.getRange()) {
            System.out.println(mountain);
        }
    }

    public static void exampleIterator() {
        System.out.println("=== Our Road Bikes ===");
        RoadBikeRange bikeRange = new RoadBikeRange();
        printIterator(bikeRange.iterator());
        System.out.println("=== Mountain Bikes");
        MountainBikeRange mountainBikeRange = new MountainBikeRange();
        printIterator(mountainBikeRange.iterator());
    }

    public static void printIterator(Iterator iter) {
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    public static void exampleFacade() {
        BikeFacade facade = new BikeFacade();
        facade.prepareForSale(new DownHill(new WideWheel(24)));

    }

    public static void exampleDecorator() {
        BikeInterface myBike = new CrossCountry(new WideWheel(24));
        System.out.println(myBike);

        myBike = new GoldFrameOption(myBike);
        System.out.println(myBike);

        myBike = new CustomGripsOption(myBike);
        System.out.println(myBike);


    }

    public static void exampleAdapter() {
        List<WheelInterface> wheels = new ArrayList<>();
        wheels.add(new WideWheel(22));
        wheels.add(new WideWheel(24));
        wheels.add(new WideWheel(24));
        wheels.add(new WideWheel(26));

        wheels.add(new UltraWheelAdapter(new UltraWheel(25)));
        wheels.add(new UltraWheelAdapter(new UltraWheel(27)));

        for(WheelInterface myWheel : wheels) {
            System.out.println(myWheel);
        }
    }

    public static void exampleSingleton() {
        System.out.println("Generator Serial Number");
        SerialNumberGenerator generator = SerialNumberGenerator.getInstance();

        System.out.println("next serial " + generator.getNextSerial());
        System.out.println("next serial " + generator.getNextSerial());
        System.out.println("next serial " + generator.getNextSerial());
        System.out.println("next serial " + generator.getNextSerial());
        System.out.println("next serial " + generator.getNextSerial());

    }

    public static void exampleBuilder() {
        Touring myBike = new Touring(new NarrowWheel(22));
        AbstractBikeBuilder builder = new RoadBikeBuilder(myBike);
        RoadBikeDirector director = new RoadBikeDirector();
        BikeInterface iBike = director.build(builder);
        System.out.println(iBike);
    }

    public static void exampleAbstractFactory() {
        AbstractBikeFactory factory = new RoadBikeFactory();
        BikeFrameInterface frame = factory.createFrame();
        BikeSeatInterface seat = factory.createSeat();
        System.out.println(frame.getFrameParts());
        System.out.println(seat.getSeatParts());
    }
}
