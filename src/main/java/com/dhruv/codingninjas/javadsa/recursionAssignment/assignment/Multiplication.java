package com.dhruv.codingninjas.javadsa.recursionAssignment.assignment;

public class Multiplication {

    public static void main(String[] args) {
        int number1 = 4;
        int number2 = 2;

        int result = multiplication(number1, number2);
        System.out.println("The multplication of "+number1+" and "+number2+ " is: "+result);
    }

    private static int multiplication(int number1, int number2) {
        if(number2 == 1 ) {
            return number1;
        }
        int result = number1 + multiplication(number1, number2-1);
        return  result;
    }
}
