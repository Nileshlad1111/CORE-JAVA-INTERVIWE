package com.corejava.oops.inheritance;

public class Mechanical extends Employee{
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setDepartment(1, "kushal", "kundal", "Mechanical", 10000);
        System.out.println(employee);
    }
}
