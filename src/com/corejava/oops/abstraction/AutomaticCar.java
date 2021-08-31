package com.corejava.oops.abstraction;

public class AutomaticCar implements Car{
    private String carType = "automatic";
    @Override
    public void carOn() {

    }

    @Override
    public void carOff() {

    }

    @Override
    public String carType() {
        return carType;
    }
}
