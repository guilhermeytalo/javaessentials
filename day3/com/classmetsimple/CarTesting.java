package com.classmetsimple;

public class CarTesting {
    public static void main(String[] args) {
        Car fusca2 = new Car();
        fusca2.brand = "Wolksvagem";
        fusca2.model = "Fusca";
        fusca2.passagerNumbers = 4;
        fusca2.capFuel = 30;
        fusca2.consumeFuel = 0.15;

        System.out.println(fusca2);
        System.out.println(fusca2.brand);
        System.out.println(fusca2.model);

        fusca2.showAutonomy();
        double autonomy = fusca2.gainAutonomy();
        System.out.println(autonomy);
        System.out.println(fusca2.gainAutonomy());
    }
}
