package com.dhruv.codingninjas.javadsa.recursion2.problem;

public class MergeSort {

    public static void main(String[] args) {
        int[] array = {12, 8, 9, 4, 5, 18, 2, 1};
        mergeSort(array);

        System.out.println("New Sorted array is: ");
        for(int i =0; i<array.length;i++) {
            System.out.print(array[i]+" ");
        }

    }

    private static void mergeSort(int[] array) {
        if(array.length<=1) {
            return ;
        }
        int[] array1 = new int[array.length/2];
        int[] array2 = new int[array.length-array1.length];

        for( int i =0; i< array1.length ;i++) {
            array1[i] = array[i];
        }

        for( int i =array1.length; i< array.length ;i++) {
            array2[i-array1.length] = array[i];
        }

        mergeSort(array1);
        mergeSort(array2);
        merge(array1, array2, array);
    }

    private static void merge(int[] array1, int[] array2, int[] array) {
        int i =0;
        int j =0;
        int k =0;
        while (i < array1.length && j < array2.length) {
            if(array1[j] >= array2[j]) {
                array[k] = array2[j];
                j++;
                k++;
            } else {
                array[k] = array1[i];
                i++;
                k++;
            }
        }
        while(i < array1.length) {
            array[k] = array1[i];
            k++;
            i++;
        }

        while(j< array2.length) {
            array[k] = array2[j];
            k++;
            j++;
        }

    }
}
