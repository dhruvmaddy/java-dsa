package com.dhruv.codingninjas.javadsa.oops1.problem.complexnumber;

public class ComplexNumber {
    int real;
    int imaginary;

    public ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }


    public void print(){
        System.out.println("Comples Number is"+this.real+"+i"+this.imaginary);
    }

    public void add(ComplexNumber complexNumber) {
        this.real = this.real+ complexNumber.real;
        this.imaginary = this.imaginary+complexNumber.imaginary;
    }

    public void multiply(ComplexNumber complexNumber) {
        int tempReal= this.real*complexNumber.real-complexNumber.imaginary*this.imaginary;
        int tempImaginary=this.real*complexNumber.imaginary+this.imaginary*complexNumber.real;
        this.real=tempReal;
        this.imaginary=tempImaginary;
    }
}
