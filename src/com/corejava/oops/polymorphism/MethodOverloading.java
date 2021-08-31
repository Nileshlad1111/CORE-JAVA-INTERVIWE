package com.corejava.oops.polymorphism;

public class MethodOverloading {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setDepartment(1, "Nilesh", "pune", "computer");
        System.out.println("To data "+"\n"+ employee);

       /* Employee employee1 = new Employee();
        employee1.setDepartment(2, "shital", "sangli", "Mechanical",10000);
        System.out.println("To data "+"\n"+ employee1);*/


    }
}
