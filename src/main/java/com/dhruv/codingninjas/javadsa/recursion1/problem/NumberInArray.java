package com.dhruv.codingninjas.javadsa.recursion1.problem;

public class NumberInArray {

    public static void main(String[] args){
        int[] array = {8,7,2,4,10,15};
        int numberToFind = 2;
        boolean result = numberinArray(array,array.length, numberToFind);
        System.out.println("The "+numberToFind+" is present in array: "+result);
    }

    private static boolean numberinArray(int[] array, int length, int numberToFind) {
        if(length ==0) {
            return false;
        }
        if(array[length-1] == numberToFind) {
            return true;
        }
        boolean result = numberinArray(array, length-1, numberToFind);
        return result;
    }
}
