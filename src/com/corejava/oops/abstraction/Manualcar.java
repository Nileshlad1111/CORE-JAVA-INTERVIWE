package com.corejava.oops.abstraction;

public class Manualcar implements Car{
    private String carType = "Manual";
    @Override
    public void carOn() {
        System.out.println("to manual car on");
    }

    @Override
    public void carOff() {
        System.out.println("to manual car off ");
    }

    @Override
    public String carType() {
        return carType;
    }
}
