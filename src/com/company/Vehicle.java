package com.company;

import java.time.LocalDate;

public abstract class Vehicle {
    private String model;
    private int yearOfIssue;
    private TypeOfEngine typeOfEngine;

    public Vehicle() {
    }

    public Vehicle(String model, int yearOfIssue, TypeOfEngine typeOfEngine) {
        this.model = model;
        this.typeOfEngine = typeOfEngine;
        this.yearOfIssue = checkYearOfIssue(yearOfIssue);
    }

    public abstract void drive();

    public String getModel() {
        return model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public TypeOfEngine getTypeOfEngine() {
        return typeOfEngine;
    }

    private int checkYearOfIssue(int yearOfIssue) {
        int currentYear = LocalDate.now().getYear();
        try {
            if (yearOfIssue > currentYear || yearOfIssue < currentYear - 100) {
                throw new InvalidYearOfIssue(this.model + " have invalid year of issue [" + yearOfIssue + "]");
            }
            return yearOfIssue;
        } catch (InvalidYearOfIssue exception) {
            System.err.println(exception.getMessage());
            return currentYear;
        }
    }

    @Override
    public String toString() {
        return "Vehicle[" + "model='" + model + '\'' + ", yearOfIssue=" + yearOfIssue + ", typeOfEngine=" + typeOfEngine + ']';
    }
}
