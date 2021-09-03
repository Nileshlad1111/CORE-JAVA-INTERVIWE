package com.corejava.solveproblem.whileloop;

public class FibonacciSeries {
    public static void main(String[] args) {
        int i=1,count=10,num1=0,num2=1;
        while (i<=count){
            System.out.println(num1);
            int total = num1 + num2;
            num1 = num2;
            num2 = total;
            i++;

        }

    }
}