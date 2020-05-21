package com.patterns.base;

import com.patterns.visitor.VisitableInterface;

/* This interface supplies the methods for Wheels */
public interface WheelInterface extends VisitableInterface {
    int getSize();
    boolean isWide();
}
