package com.dhruv.codingninjas.javadsa.oops1.lecturertheory.dynamicArray;

public class DynamicArray {

    private int[] dynamicArray;
    private int nextElementIndex;

    public DynamicArray(){
        dynamicArray=new int[5];
        nextElementIndex=0;
    }

    public int size() {
        return nextElementIndex;
    }

    public boolean isEmpty() {
        return nextElementIndex==0;
    }

    public int get(int index) {
        if(index>=nextElementIndex) {
            return -1;
        }
        return dynamicArray[index];
    }
    public void set(int index, int element) {
        if(index<=nextElementIndex) {
            dynamicArray[index] =element;
        }
    }

    public void add(int element) {
        if(nextElementIndex == dynamicArray.length) {
            doubleCapacity(dynamicArray);
        }
        dynamicArray[nextElementIndex] = element;
        nextElementIndex++;
    }

    public int removeLast() {
        if (nextElementIndex ==0){
            return -1;
        }
        return nextElementIndex--;
    }

    public void doubleCapacity(int[] array) {
        int[] temp = array;
        dynamicArray = new int[temp.length*2];
        for (int i =0;i< temp.length;i++) {
            dynamicArray[i] = temp[i];
        }
    }

}
