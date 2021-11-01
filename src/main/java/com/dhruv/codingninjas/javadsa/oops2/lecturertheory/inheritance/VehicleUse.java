package com.dhruv.codingninjas.javadsa.oops2.lecturertheory.inheritance;

public class VehicleUse {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setColor("Red");
        vehicle.setMaxSpeed(80);
        vehicle.print();

        Car car = new Car();
        car.setColor("Black");
        car.setMaxSpeed(120);
        car.setNumDoors(6);
    //    car.print();

        Bicycle bicycle = new Bicycle();
    //    bicycle.print();
    }
}
