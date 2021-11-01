package com.dhruv.codingninjas.javadsa.recursion1.problem;

public class Power {
    public static void main(String[] args) {
        int number=10;
        int power =5;
        int output = power(10,5);
        System.out.println(number+"X"+power+": "+output);
    }


    private static int power(int number, int power) {
        if(power==0) {
            return 1;
        }
        int smallOutput = number * power(number, power-1);
        return smallOutput;
    }
}
