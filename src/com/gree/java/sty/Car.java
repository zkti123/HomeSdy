package com.gree.java.sty;

class Car {
    String kind;
    String color;
    int year;
    void run(){
        System.out.println("car is running");


    }
    void speedUp(){
        System.out.println("car is speeding up.");
    }

    void printInfo() {
        System.out.printf("kind: %s, color : %s, year: %d\n"
                ,kind, color, year);
    }


}
