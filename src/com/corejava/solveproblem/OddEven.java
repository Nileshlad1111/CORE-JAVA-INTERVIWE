package com.corejava.solveproblem;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("To check the number odd and even "+"\n"+"Enter the number:");
        int number = scanner.nextInt();
        if(number%2==0){
            System.out.println("even number");
        }else {
            System.out.println("odd number");
        }
    }
}
