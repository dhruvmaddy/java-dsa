package com.dhruv.codingninjas.javadsa.oops2.lecturertheory.exception;

public class ExceptionDemo {

    public static int divide(int num1, int num2) throws DivideByZeroException {
        if(num2==0) {
            throw new DivideByZeroException();
        }
        return num1/num2;
    }

    public static void main(String[] args) throws DivideByZeroException {
        divide(10, 0);
    }
}
