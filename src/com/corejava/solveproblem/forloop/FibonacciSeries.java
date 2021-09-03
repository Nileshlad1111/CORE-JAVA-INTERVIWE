package com.corejava.solveproblem.forloop;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int num1 = 0, num2=1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of fibonacci series");
        int number = scanner.nextInt();
        for (int i =1; i<=number; ++i){
            System.out.println(num1);
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
            System.out.println(sumOfPrevTwo);
        }
    }
}
