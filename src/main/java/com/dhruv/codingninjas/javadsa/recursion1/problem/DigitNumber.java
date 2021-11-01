package com.dhruv.codingninjas.javadsa.recursion1.problem;

public class DigitNumber {
    public static void main(String[] args) {
        int number = 106754;
        int output = numDigits(number);
        System.out.println("The number of digits present in "+number+" is: "+output);
    }

    private static int numDigits(int number) {
        if (number <=9 && number>=0){
            return 1;
        }
        int smallOutput = 1+numDigits(number/10);
        return smallOutput;
    }
}
