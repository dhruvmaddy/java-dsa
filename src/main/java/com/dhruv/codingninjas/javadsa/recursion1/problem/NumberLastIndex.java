package com.dhruv.codingninjas.javadsa.recursion1.problem;

public class NumberLastIndex {

    public static void main(String[] args) {
        int[] array = {2, 2, 2, 4, 6, 5, 6, 7, 9, 11};
        int numberToFind= 2;
        int result = numberFirstIndex(array, numberToFind, array.length);
        System.out.println("The last index of "+numberToFind+ " is: "+result);
    }

    private static int numberFirstIndex(int[] array, int numberToFind, int length){
        if(length == 0) {
            return -1;
        }
        if(array[length-1] == numberToFind) {
            return length-1;
        }
        int result = numberFirstIndex(array, numberToFind, length-1);
        return result;
    }
}
