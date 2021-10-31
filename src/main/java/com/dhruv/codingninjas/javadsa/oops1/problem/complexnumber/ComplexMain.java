package com.dhruv.codingninjas.javadsa.oops1.problem.complexnumber;

public class ComplexMain {

    public static void main(String[] args) {
        ComplexNumber complexNumber1 = new ComplexNumber(2,3);
        complexNumber1.print();
        ComplexNumber complexNumber2 = new ComplexNumber(2,3);
        complexNumber2.print();
        complexNumber1.add(complexNumber2);
        System.out.println("New ComplexNumber After addition");
        complexNumber1.print();
        complexNumber2.print();
        complexNumber1.multiply(complexNumber2);
        System.out.println("New ComplexNumber After multiplication");
        complexNumber1.print();
        complexNumber2.print();
    }

}
