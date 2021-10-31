package com.dhruv.codingninjas.javadsa.oops1.problem.polynomial;

public class PolynomialMain {


    public static void main(String[] args) {
        Polynomial polynomial1= new Polynomial();
        polynomial1.setCoefficient(1,4);
        polynomial1.setCoefficient(3,5);
        polynomial1.setCoefficient(5, 7);
        polynomial1.print();
        Polynomial polynomial2= new Polynomial();
        polynomial2.setCoefficient(2,3);
        polynomial2.setCoefficient(4,4);
        polynomial2.setCoefficient(5, 5);
        polynomial2.print();
        Polynomial polynomialAdd = polynomial1.add(polynomial2);
        polynomialAdd.print();
        Polynomial polynomialSubstarct = polynomial1.substract(polynomial2);
        polynomialSubstarct.print();
        Polynomial polynomialMul = polynomial1.multiply(polynomial2);
        polynomialMul.print();
    }
}
