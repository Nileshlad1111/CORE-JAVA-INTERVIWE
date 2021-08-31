package com.corejava.oops.inheritance.multilevelinheritance;

public class Computer extends Employee {

    @Override
    public void setDepartment(int id, String name, String address, String department, long salary) {
        super.setDepartment(id, name, address, department, salary);
    }

    public void computerName(){
        System.out.println("computer department");
    }

}
