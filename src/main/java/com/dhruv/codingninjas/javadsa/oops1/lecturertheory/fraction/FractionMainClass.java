package com.dhruv.codingninjas.javadsa.oops1.lecturertheory.fraction;

public class FractionMainClass {

    public static void main(String[] args) {

        Fraction fraction = new Fraction(4, 6);
        fraction.print();
        fraction.increment();
        fraction.print();
        Fraction fraction2 = new Fraction(4, 6);
        fraction2.print();
        fraction.add(fraction2);
        fraction.print();
        Fraction f= Fraction.twoFraction(fraction,fraction2);
        f.print();

    }
}
