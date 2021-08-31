package com.corejava.oops.abstraction;

public class AutomaticCar implements Car{
    private String carType = "automatic";
    @Override
    public void carOn() {
        System.out.println("car on ");
    }

    @Override
    public void carOff() {
        System.out.println("car off");
    }

    @Override
    public String carType() {
        return carType;
    }
}
