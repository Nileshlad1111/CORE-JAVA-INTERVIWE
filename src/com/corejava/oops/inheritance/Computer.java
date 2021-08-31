package com.corejava.oops.inheritance;

public class Computer extends Employee{
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setDepartment(2, "shital", "sangli", "IT",10000);
        System.out.println("To data "+"\n"+ employee1);
    }
}
