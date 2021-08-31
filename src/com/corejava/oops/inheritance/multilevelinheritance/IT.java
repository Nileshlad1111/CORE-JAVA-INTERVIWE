package com.corejava.oops.inheritance.multilevelinheritance;

public class IT extends Computer{

    public void setDepartmentIt() {
        System.out.println("IT department");
    }



    public static void main(String[] args) {
        IT it = new IT();
        it.setDepartment(1, "nilesh", "pune", "computer", 100);
        it.computerName();
        it.setDepartmentIt();
        System.out.println(it);

    }
}
