package com.corejava.oops.polymorphism;

public class Employee {
    int rollNumber;
    String name;
    String address;
    long salary;
    String department;

    public void setDepartment(int rollNumber, String name, String address,String department, long salary){

        this.rollNumber = rollNumber;
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.department = department;

    }

    public void setDepartment(int rollNumber, String name, String address, String department){
        this.rollNumber = rollNumber;
        this.name = name;
        this.address = address;
        this.department = department;
     }

    @Override
    public String toString() {
        return "Employee{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
