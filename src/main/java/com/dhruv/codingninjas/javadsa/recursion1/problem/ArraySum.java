package com.dhruv.codingninjas.javadsa.recursion1.problem;

public class ArraySum {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,6,8};
        int result = sumArray(array, array.length);
        System.out.println("The sum of array is: "+result);
    }

    public static int sumArray(int[] array, int length) {
        if(length==0) {
            return 0;
        }
        int smallOutput=sumArray(array, length-1);
        int sum = array[length-1]+smallOutput;
        return sum;
    }

}
