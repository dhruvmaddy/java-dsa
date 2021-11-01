package com.dhruv.codingninjas.javadsa.oops2.lecturertheory.inheritance;

public class Vehicle {
    private String color;
    private double maxSpeed;

    public Vehicle() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void print() {
        System.out.println("Color: "+getColor()+" | MaxSpeed: "+getMaxSpeed());
    }

}
