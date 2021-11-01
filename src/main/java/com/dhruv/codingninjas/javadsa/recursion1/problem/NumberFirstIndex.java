package com.dhruv.codingninjas.javadsa.recursion1.problem;

public class NumberFirstIndex {

    public static void main(String[] args) {
        int[] array = {2, 2, 2, 4, 6, 5, 6, 7, 9, 11};
        int numberToFind= 2;
        int result = numberFirstIndex(array, numberToFind, 0);
        System.out.println("The "+numberToFind+ " is found at index: "+result);
    }

    private static int numberFirstIndex(int[] array, int numberToFind, int length){
        if(length == array.length) {
            return -5;
        }
        int result = numberFirstIndex(array, numberToFind, length+1);
        if(array[length] == numberToFind) {
            return length;
        }
        return result;
    }
}
