package com.gree.java.sty;

public class Car1 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.kind = "sonata";
        myCar.color = "white";
        myCar.year = 2015;

        Car yourCar = new Car();
        yourCar.kind = "pride";
        yourCar.color = "blue";
        yourCar.year = 2017;

        myCar.run();
        yourCar.run();

        myCar.speedUp();
        yourCar.speedUp();

        myCar.printInfo();
        yourCar.printInfo();
    }
}
