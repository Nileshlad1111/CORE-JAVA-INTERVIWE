package com.corejava.constructor.noargument;

public class Employee {
    public Employee() {
        System.out.println("Default constructor");
    }


    @Override
    public String toString() {
        return "Employee{}";
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println(employee);
    }
}
