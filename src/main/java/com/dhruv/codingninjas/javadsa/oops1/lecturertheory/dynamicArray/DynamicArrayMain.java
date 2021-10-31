package com.dhruv.codingninjas.javadsa.oops1.lecturertheory.dynamicArray;

public class DynamicArrayMain {

    public static void main(String[] args) {

        DynamicArray dynamicArray = new DynamicArray();

        for(int i=1;i<100;i++){
            dynamicArray.add(100+i);
        }
        System.out.println(dynamicArray.size());
        System.out.println(dynamicArray.get(2));
        dynamicArray.set(3,1001);
        System.out.println(dynamicArray.get(3));
        System.out.println(dynamicArray.removeLast());
        System.out.println("Size - "+dynamicArray.size());

    }
}
