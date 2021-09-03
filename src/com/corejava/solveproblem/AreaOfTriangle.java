package com.corejava.solveproblem;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        System.out.println("To calculate the area of triangle ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base value");
        long base = scanner.nextInt();
        System.out.println("Enter the height value");
        long height = scanner.nextInt();

        long area=base*height/2;
        System.out.println(area);
/*
        System.out.println("To calculate of triangle : " + (0.5*(base*height)));
*/

    }
}