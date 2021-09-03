package com.corejava.solveproblem.whileloop;

public class FactorialNumber {
    public static void main(String[] args) {
        int i =1, count=5, fact=1;
        while (i<=count){
            fact = fact*i;
            i++;
            System.out.println(fact);
        }
    }
}
