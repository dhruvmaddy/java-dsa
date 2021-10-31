package com.dhruv.codingninjas.javadsa.oops1.lecturertheory.gettersetter;

public class Student {

    private String name;
    private int rollNumber;
    double cgpa= 8.4;
    final double conversionFactor = 9.5;
    static int numStudent=0;

    public Student() {
        super();
        numStudent++;
    }

    public Student(String name, int rollNumber, double cgpa) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.cgpa = cgpa;
        numStudent++;
    }

    public Student(String name, int rollNumber) {
        this.name=name;
        this.rollNumber= rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public double getConversionFactor() {
        return conversionFactor;
    }

    public int getNumStudent() {
        return numStudent;
    }

    public void setNumStudent(int numStudent) {
        this.numStudent = numStudent;
    }
}
