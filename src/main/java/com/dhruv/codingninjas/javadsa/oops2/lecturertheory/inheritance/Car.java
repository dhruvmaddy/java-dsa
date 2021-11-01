package com.dhruv.codingninjas.javadsa.oops2.lecturertheory.inheritance;

public class Car extends Vehicle{
    int numDoors;

    public Car() {
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public void print() {
        System.out.println("Car: {Color: "+getColor()+ " | MaxSpeed: "+getMaxSpeed()+" | Number of Doors:"+getNumDoors()+"}");
    }
}
