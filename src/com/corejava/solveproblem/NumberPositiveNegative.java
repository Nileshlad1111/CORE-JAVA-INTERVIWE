package com.corejava.solveproblem;

import java.util.Scanner;

public class NumberPositiveNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number = scanner.nextInt();

        if (number>0){
            System.out.println("positive number");
        }else {
            System.out.println("negative number");
        }
    }
}
