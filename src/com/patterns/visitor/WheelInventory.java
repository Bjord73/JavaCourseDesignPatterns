package com.patterns.visitor;

import com.patterns.base.WheelInterface;

public class WheelInventory implements WheelVisitorInterface {
    private int spokesCount, bearingsCount;

    public WheelInventory() {
        spokesCount = 29;
        bearingsCount = 1;
    }

    @Override
    public void visit(WheelInterface wheel) {
        System.out.println("The wheel has: " + spokesCount +
                " spokes and " + bearingsCount + " bearing");
    }

    @Override
    public void visit(Spokes spoke) {
        spokesCount++;
    }

    @Override
    public void visit(Bearings bearings) {
        bearingsCount++;
    }
}
