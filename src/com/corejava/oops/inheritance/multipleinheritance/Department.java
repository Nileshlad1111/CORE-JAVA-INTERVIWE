package com.corejava.oops.inheritance.multipleinheritance;

public class Department  implements Employee,Manager{
    @Override
    public void department() {
        System.out.println("computer");
    }
    public static void main(String[] args) {
        Department department = new Department();
        department.department();

    }

}
