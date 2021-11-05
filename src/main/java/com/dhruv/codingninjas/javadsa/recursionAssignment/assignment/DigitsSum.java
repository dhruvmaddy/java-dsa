package com.dhruv.codingninjas.javadsa.recursionAssignment.assignment;

public class DigitsSum {

    public static void main (String[] args) {
        int number = 123456;
        int digitSum = sumOfDigits(number);
        System.out.println("The sum of Digits in "+number+" :"+digitSum);
    }

    private static int sumOfDigits(int number) {
        if (number <= 9 && number >= 0) {
            return  number;
        }
        int sum =0;
        sum = number%10 + sumOfDigits(number/10);
        return sum;
    }
}
