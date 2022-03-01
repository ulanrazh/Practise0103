package com.company;

public class Car extends Vehicle{

    public Car() {
    }

    public Car(String model, int yearOfIssue, TypeOfEngine typeOfEngine) {
        super(model, yearOfIssue, typeOfEngine);
    }

    @Override
    public void drive() {
        System.out.println("We driving car " + super.getModel());
    }

    @Override
    public String toString() {
        return "Car[] " + super.toString();
    }
}
