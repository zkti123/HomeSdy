package com.green.javaHome.sty.study_one.method;

public class CarConstructor1 {
    public static void main(String[] args) {

        Car c1 = new Car();

        c1.color = "white";
        c1.gearType = "auto";
        c1.door = 4;

        Car c2 = new Car("Black", "self", 6);

        System.out.println("c1 의 color = "+ c1.color+", gearType = "+ c1.gearType+", door = "+ c1.door);
        System.out.println("c2 의 color = "+ c2.color+", gearType = "+ c2.gearType+", door = "+ c2.door);

    }


}

class Car {
    String color;
    String gearType;
    int door;

    Car() {
    }

    Car(String c, String g, int d) {
        color = c;
        gearType = g;
        door = d;
    }
}
