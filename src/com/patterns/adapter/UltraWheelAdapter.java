package com.patterns.adapter;

import com.patterns.base.AbstractWheel;


    public class UltraWheelAdapter extends AbstractWheel {

        public UltraWheelAdapter(UltraWheel wheel) {
            super(wheel.getWheelSize(), false);
        }
    }
