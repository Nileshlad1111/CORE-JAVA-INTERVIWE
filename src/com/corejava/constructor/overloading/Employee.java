package com.corejava.constructor.overloading;

public class Employee {

    int rollNumber;
    String name ;
    String address;
    long salary;


    public Employee(int rollNumber, String name, String address) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.address = address;
    }

    public Employee(int rollNumber, String name, String address, long salary) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.address = address;
        this.salary = salary;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        Employee employee = new Employee(1, "nilesh", "pune");
        Employee employee1 = new Employee(1, "kumar", "sangli",2000);

        System.out.println("Employee data"+"\n"+employee);
        System.out.println(employee1);
    }
}
