package com.dhruv.codingninjas.javadsa.recursionAssignment.assignment;

public class GeometricSum {

    public static void main(String[] args) {
        int num = 5;
        double result = geometricSum(5);
        System.out.println("The geometric sum is: "+result);
    }

    public static double geometricSum(int num) {
        if(num == 0) {
            return 1;
        }
        return 1/(double) Math.pow(2, num)+geometricSum(num-1);
    }
}
