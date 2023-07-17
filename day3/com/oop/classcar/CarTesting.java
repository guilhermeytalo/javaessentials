package com.oop.classcar;

public class CarTesting {
    public static void main(String[] args) {
        car van = new car();
        van.brand = "Fiat";
        van.model = "Ducato";
        van.passagerNumbers = 10;
        van.capFuel = 100;
        van.consumeFuel = 0.2;

        System.out.println(van);
        System.out.println(van.brand);
        System.out.println(van.model);

        car fusca = new car();
        fusca.brand = "Volkswagen";
        fusca.model = "Fusca";
        fusca.passagerNumbers = 4;
        fusca.capFuel = 30;
        fusca.consumeFuel = 0.15;

        System.out.println(fusca);
        System.out.println(fusca.brand);
        System.out.println(fusca.model);
    }
}
