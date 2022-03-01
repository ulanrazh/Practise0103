package com.company;

import static com.company.TypeOfEngine.*;

public class Main {

    public static void main(String[] args) {
        Vehicle bmw1 = new Car("BMW1", 2200, HYBRID);
        Vehicle bmw2 = new Car("BMW2", 2022, ELECTROMOBILE);
        Vehicle bmw3 = new Car("BMW3", 1900, FUEL);
        Vehicle jeep = new Truck("JEEP1", 2010, FUEL);
        Vehicle jeep2 = new Truck("JEEP2", 2005, FUEL);
        Vehicle jeep3 = new Truck("JEEP3", 1200, FUEL);
        Vehicle honda1 = new Car("HONDA1", 2018, HYBRID);
        Vehicle honda2 = new Car("HONDA2", 2019, HYBRID);
        Vehicle honda3 = new Car("HONDA3", 2020, HYBRID);
        Vehicle truck1 = new Truck("Kamaz1", 2023, FUEL);
        Vehicle truck2 = new Truck("Kamaz2", 2023, HYBRID);
        Vehicle truck3 = new Truck("Kamaz3", 2023, ELECTROMOBILE);

        Vehicle[] vehicles = {bmw1, bmw2, bmw3, jeep, jeep2, jeep3,
                honda1, honda2, honda3, truck1, truck2, truck3};

        int quantityOfElectricVehicles = getQuantityOfElectricVehicles(vehicles);
        int quantityOfHybridVehicles = getQuantityOfHybridVehicles(vehicles);
        int quantityOfFuelVehicles = getQuantityOfFuelVehicles(vehicles);

        Vehicle[] electricVehicles = new Vehicle[quantityOfElectricVehicles];
        Vehicle[] hybridVehicles = new Vehicle[quantityOfHybridVehicles];
        Vehicle[] fuelVehicles = new Vehicle[quantityOfFuelVehicles];

        electricVehicles = getOnlyElectricVehicles(electricVehicles, vehicles);
        hybridVehicles = getOnlyHybridVehicles(hybridVehicles, vehicles);
        fuelVehicles = getOnlyFuelVehicles(fuelVehicles, vehicles);

        System.out.println("\nGroup by electric cars: \n" +  "==============================================================================");
        printElementOfArray(electricVehicles);
        System.out.println("\nGroup by hybrid cars: \n" +  "==============================================================================");
        printElementOfArray(hybridVehicles);
        System.out.println("\nGroup by fuel cars:  \n" +  "==============================================================================");
        printElementOfArray(fuelVehicles);
        System.out.println("==============================================================================");
    }

    private static Vehicle[] getOnlyElectricVehicles(Vehicle[] newEmptyArray, Vehicle[] vehicles) {
        int counterForNewEmptyArray = 0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getTypeOfEngine().equals(ELECTROMOBILE)) {
                newEmptyArray[counterForNewEmptyArray] = vehicle;
                counterForNewEmptyArray++;
            }
        }
        return newEmptyArray;
    }

    private static int getQuantityOfElectricVehicles(Vehicle[] vehicles) {
        int electricVehicleCounter = 0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getTypeOfEngine().equals(ELECTROMOBILE)) {
                electricVehicleCounter++;
            }
        }
        return electricVehicleCounter;
    }

    private static Vehicle[] getOnlyHybridVehicles(Vehicle[] newEmptyArray, Vehicle[] vehicles) {
        int counterForNewEmptyArray = 0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getTypeOfEngine().equals(HYBRID)) {
                newEmptyArray[counterForNewEmptyArray] = vehicle;
                counterForNewEmptyArray++;
            }
        }
        return newEmptyArray;
    }

    private static int getQuantityOfHybridVehicles(Vehicle[] vehicles) {
        int hybridVehicleCounter = 0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getTypeOfEngine().equals(HYBRID)) {
                hybridVehicleCounter++;
            }
        }
        return hybridVehicleCounter;
    }

    private static Vehicle[] getOnlyFuelVehicles(Vehicle[] newEmptyArray, Vehicle[] vehicles) {
        int counterForNewEmptyArray = 0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getTypeOfEngine().equals(FUEL)) {
                newEmptyArray[counterForNewEmptyArray] = vehicle;
                counterForNewEmptyArray++;
            }
        }
        return newEmptyArray;
    }

    private static int getQuantityOfFuelVehicles(Vehicle[] vehicles) {
        int fuelVehicleCounter = 0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getTypeOfEngine().equals(FUEL)) {
                fuelVehicleCounter++;
            }
        }
        return fuelVehicleCounter;
    }

    private static void printElementOfArray(Vehicle[] vehicles) {
        for (Vehicle vehicle1 : vehicles) {
            System.out.println(vehicle1);
        }
    }
}
