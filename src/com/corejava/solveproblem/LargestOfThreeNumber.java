package com.corejava.solveproblem;

import java.util.Scanner;

public class LargestOfThreeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number one :");
        int number = scanner.nextInt();

        System.out.println("Enter the number two :");
        int number1 = scanner.nextInt();

        System.out.println("Enter the number three :");
        int number2 = scanner.nextInt();

        if(number>=number1 && number>=number2 ){
            System.out.println(number+"largest number");
        }if(number>=number2 && number1>=number2){
            System.out.println(number1+"largest number");

        }else {
            System.out.println(number2+"largest number");
        }

        }
    }
