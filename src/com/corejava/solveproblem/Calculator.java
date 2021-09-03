package com.corejava.solveproblem;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number ");
        long fristNumber = sc.nextInt();

        System.out.println("Enter the second number ");
        long secondNumber = sc.nextInt();

        System.out.println("To choice the operation"+"\n"+"1.addition"+"\n"+"2.subtraction"+"\n"+"3.multiplication"+"\n"+"4.division");
        int operation=sc.nextInt();

        switch (operation){
            case 1:
                System.out.println("addition =" +(fristNumber+secondNumber));
                break;

            case 2:
                System.out.println("subtraction = "+(fristNumber-secondNumber));
                break;

            case 3:
                System.out.println("multiplication ="+(fristNumber*secondNumber));
                break;

            case 4:
                System.out.println("division = "+(fristNumber/secondNumber));
                break;
            default:
                System.out.println("no available operation");

            }
    }
}
