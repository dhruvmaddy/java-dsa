package com.dhruv.codingninjas.javadsa.recursion1.lecturertheory;

public class Factorial {

    public static void main(String[] args) {
        int number = 5;
        int factNumber = factorial(number);
        System.out.println("Factorial of "+number+" is : "+factNumber);
    }

    public static int factorial(int number) {
        if(number ==0) {
            return 1;
        }
        int smallOutput = factorial(number-1);
        int output = number*smallOutput;
        return output;
    }

}
