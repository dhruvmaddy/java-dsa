package com.dhruv.codingninjas.javadsa.recursion2.lecturertheory;

public class BinarySearch {

    public static void main(String[] args) {

        int[] array = {2, 4, 5, 6, 8, 10, 15};
        int elementtobeSearch = 18;
        int result = binarySearch(array, 0, array.length-1,  elementtobeSearch);
        if( result == -1) {
            System.out.println("OOPS Sorry! element is not found within Array.");
        } else {
            System.out.println("Element is found at "+(result+1)+" position");
        }
    }

    private static int binarySearch(int[] array, int startIndex, int endIndex, int elementtobeSearch) {
        if(startIndex>endIndex) {
            return -1;
        }
        int midIndex = (startIndex+endIndex)/2;
        if(array[midIndex] == elementtobeSearch) {
            return midIndex;
        } else if (array[midIndex] > elementtobeSearch) {
            return binarySearch(array, startIndex, midIndex-1, elementtobeSearch);
        } else {
            return binarySearch(array, midIndex+1, endIndex, elementtobeSearch);
        }
    }
}
