package com.patterns.visitor;

public class Spokes implements VisitableInterface {
    @Override
    public void acceptVisitor(WheelVisitorInterface visitor) {
        visitor.visit(this);
    }
}
