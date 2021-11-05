package com.dhruv.codingninjas.javadsa.recursionAssignment.assignment;

public class CountZero {

    public static void main(String[] args) {
        int number = 6700890;
        int numberofZero = countZero(number);
        System.out.println("The Number of zeros in "+number+" is: "+numberofZero);
    }

    public static int countZero(int number) {
        if( number <=9 && number >=1) {
            return 0;
        }
        int result =0;
        if( number%10 == 0) {
            result++;
        }
        result +=  countZero(number/10);
        return result;

    }
}
