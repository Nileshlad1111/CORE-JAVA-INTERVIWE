package com.corejava.solveproblem.forloop;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number ");
        int number = scanner.nextInt();
        int fact = 1;

        for (int i=1; i<=number;i++){
            fact = fact * number;
        }
        System.out.println("number of factorial " +fact);
    }
}
