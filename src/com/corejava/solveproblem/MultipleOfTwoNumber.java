package com.corejava.solveproblem;

import java.util.Scanner;

public class MultipleOfTwoNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number one :");
        int number = scanner.nextInt();

        System.out.println("Enter the number two :");
        int number1 = scanner.nextInt();

        System.out.println("multiplication of two number :" + (number*number1));

    }
}
