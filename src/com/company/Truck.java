package com.company;

public class Truck extends Vehicle{

    public Truck() {
    }

    public Truck(String model, int yearOfIssue, TypeOfEngine typeOfEngine) {
        super(model, yearOfIssue, typeOfEngine);
    }

    @Override
    public void drive() {
        System.out.println("We driving truck " + super.getModel());

    }

    @Override
    public String toString() {
        return "Truck[] " + super.toString();
    }
}

