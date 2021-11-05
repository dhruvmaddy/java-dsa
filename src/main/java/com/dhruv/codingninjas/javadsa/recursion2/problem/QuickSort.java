package com.dhruv.codingninjas.javadsa.recursion2.problem;

public class QuickSort {

    public static void main(String[] args) {

        int[] array = {12, 8, 9, 4, 5, 18, 2, 1};
        quickSort(array, 0, array.length-1);

        System.out.println("New Sorted array is: ");
        for(int i =0; i<array.length;i++) {
            System.out.print(array[i]+" ");
        }
    }

    private static void quickSort(int[] array, int startIndex, int endIndex) {

        if(startIndex >= endIndex) {
            return ;
        }
        int pivotIndex = partition(array, startIndex,endIndex);
        quickSort(array,startIndex,pivotIndex-1);
        quickSort(array, pivotIndex+1, endIndex);
    }

    private static int partition(int[] array, int startIndex, int endIndex) {
        int pivotElement = array[startIndex];
        int smallerNumberCount=0;
        for(int i=startIndex+1; i<=endIndex; i++) {
            if(array[i]<pivotElement) {
                smallerNumberCount++;
            }
        }
        swap(array, startIndex, startIndex+smallerNumberCount);

        int i = startIndex;
        int j = endIndex;
        while(i<j)
        {
            if(array[i]<pivotElement ) {
                i++;
            } else if (array[j] > pivotElement) {
                j--;
            } else {
                swap(array, i, j);
                i++;
                j--;
            }
        }
        return startIndex+smallerNumberCount;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
