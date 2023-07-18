package com.classmetsimple;

public class Car {
    String brand;
    String model;
    int passagerNumbers;
    double capFuel;
    double consumeFuel;

    void showAutonomy() {
        System.out.println("A autonomia do carro é: "
                + capFuel * consumeFuel + "km");
    }

    double gainAutonomy() {
        System.out.println("Method Called.");
        return capFuel * consumeFuel;
    }
}
