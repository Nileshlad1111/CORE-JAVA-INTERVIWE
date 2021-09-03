package com.corejava.array;

public class Array {

    //int [] intArray = new int[10];

    public static void main(String[] args) {
        int [] arrayNumber ;
        arrayNumber = new int[5];
        arrayNumber [0] = 10;
        arrayNumber [1] = 110;
        arrayNumber [2] = 120;
        arrayNumber [3] = 130;
        arrayNumber [4] = 140;

        for (int i= 0; i<arrayNumber.length;i++){
            System.out.println(i+""+i);
        }
    }

}
