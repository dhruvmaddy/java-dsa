package com.dhruv.codingninjas.javadsa.oops1.lecturertheory.fraction;

public class Fraction {

    int numerator;
    int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        simplyfy();
    }

    public Fraction() {
    }

    private void simplyfy() {
        int gcd =1;
        int smaller = Math.min(numerator,denominator);
        for(int i=2;i<=smaller;i++) {
            if(numerator%i==0 && denominator%i ==0) {
                gcd=i;
            }
        }
        numerator=numerator/gcd;
        denominator=denominator/gcd;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }


    public void print() {
        System.out.println(numerator+"/"+denominator);
    }

    public void increment () {
        numerator = numerator+denominator;
        simplyfy();
    }

    public void add(Fraction f) {
        this.numerator=this.numerator*f.denominator+f.numerator*this.denominator;
        this.denominator=this.denominator*f.denominator;
        simplyfy();
    }

    public static Fraction twoFraction(Fraction fraction1, Fraction fraction2) {
        int numerator=fraction1.numerator*fraction2.denominator+fraction2.numerator*fraction1.denominator;
        int denominator=fraction1.denominator*fraction2.denominator;
        Fraction fraction = new Fraction(numerator, denominator);
        return fraction;
    }

}
