package com.corejava.solveproblem;

import java.util.Scanner;

public class SwappingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number one :");
        int number = scanner.nextInt();

        System.out.println("Enter the number two :");
        int number1 = scanner.nextInt();

        number = number ^ number1;
        number1 = number ^ number1;
        scanner.close();
        System.out.println(number);
        System.out.println(number1);
    }

}
