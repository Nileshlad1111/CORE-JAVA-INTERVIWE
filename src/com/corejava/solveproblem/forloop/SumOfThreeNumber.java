package com.corejava.solveproblem.forloop;

import java.util.Scanner;

public class SumOfThreeNumber {
    public static void main(String[] args) {
        int total = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        for (int cout =0; cout<=num; cout++){
            total = total + cout;
/*
            System.out.println(total);
*/
        }
        System.out.println("total of number "+total);
    }
}
