package com.corejava.oops.abstraction;

public class Main {
    public static void main(String[] args) {
        Manualcar manualcar = new Manualcar();
        manualcar.carOn();
        manualcar.carOff();
        System.out.println(manualcar.carType());

        AutomaticCar automaticCar = new AutomaticCar();
        automaticCar.carOn();
        automaticCar.carOff();
        System.out.println(automaticCar.carType());
    }
}
