package com.dhruv.codingninjas.javadsa.recursion1.lecturertheory;

public class SortedArrayAscending {

    public static void main(String[] args) {
        int[] array = {2,3,3,4,6,8,10};
        boolean isSorted = sortedArray(array, array.length);
        System.out.println("The given Array is Sorted: "+isSorted);
    }

    public static boolean sortedArray(int[] array, int length) {
        if(length == 1) {
            return true;
        }
        if(array[length-1]< array[length-2]){
            return false;
        }
        boolean result = sortedArray(array, length-1);
        return result;
    }


}
