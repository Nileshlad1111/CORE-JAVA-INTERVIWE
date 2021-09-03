package com.corejava.solveproblem;

import java.util.Scanner;

public class ReadNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number :");
        int number = scanner.nextInt();
        scanner.close();
        System.out.println("To number is  :"+ number);
    }
}
