package com.patterns.visitor;

public class Bearings implements VisitableInterface {
    @Override
    public void acceptVisitor(WheelVisitorInterface visitor) {
        visitor.visit(this);
    }
}
