package com.dhruv.codingninjas.javadsa.recursion1.lecturertheory;

public class NaturalSum {

    public static void main(String[] args) {
        int number = 10;
        int naturalSum = sum(number);
        System.out.println("Sum of first "+number+" natural number is: "+naturalSum);
    }

    public static int sum(int number) {
        if(number==0){
            return 0;
        }
        int output = number+sum(number-1);
        return output;

    }
}
