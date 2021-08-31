package com.corejava.oops.inheritance;

public class Employee {
    int id;
    String name;
    String address;
    long salary;
    String department;

    public void setDepartment(int id, String name, String address,String department, long salary){

        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.department = department;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
