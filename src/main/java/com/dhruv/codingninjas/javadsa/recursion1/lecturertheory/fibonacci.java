package com.dhruv.codingninjas.javadsa.recursion1.lecturertheory;

public class fibonacci {

    public static void main(String[] args) {
        int number = 5;
        int output =  fibonac(number);
        System.out.println("The "+number+"th fibonacci number is: "+output);
    }

    private static int fibonac(int number) {
        if( number==1) {
            return 1;
        }
        if( number==2) {
            return 1;
        }
        int output = fibonac(number-1)+fibonac(number-2);
        return output;
    }
}
