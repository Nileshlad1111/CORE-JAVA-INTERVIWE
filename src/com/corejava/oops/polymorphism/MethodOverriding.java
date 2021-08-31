package com.corejava.oops.polymorphism;

public class MethodOverriding extends Employee{
    @Override
    public void setDepartment(int rollNumber, String name, String address, String department, long salary) {
        super.setDepartment(rollNumber, name, address, department, salary);
    }

    public static void main(String[] args) {
    Employee employee1 = new Employee();
    employee1.setDepartment(2, "shital", "sangli", "Mechanical",10000);
    System.out.println("To data "+"\n"+ employee1);
    }
}
