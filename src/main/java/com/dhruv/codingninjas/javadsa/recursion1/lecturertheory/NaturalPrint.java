package com.dhruv.codingninjas.javadsa.recursion1.lecturertheory;

public class NaturalPrint {

    public static void main(String[] args) {
        int number = 10;
        naturalPrint(number);
    }

    public static void naturalPrint(int number) {
        if(number==0){
            return;
        }
        naturalPrint(number-1);
        System.out.print(number+ " ");
    }
}
