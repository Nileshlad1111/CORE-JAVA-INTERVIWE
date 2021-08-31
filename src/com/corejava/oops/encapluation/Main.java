package com.corejava.oops.encapluation;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setRollNumber(10);
        employee.setName("nilesh");
        employee.setAddress("Pune");
        employee.setSalary(10000);


        System.out.println(employee.getRollNumber());
        System.out.println(employee.getName());
        System.out.println(employee.getAddress());
        System.out.println(employee.getSalary());
    }
}
