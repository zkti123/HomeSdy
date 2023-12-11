package com.green.javaHome.sty.study_one.generis;

import java.util.ArrayList;

public class GenericsEx2 {
    public static void main(String[] args) {
        Boxs1<Fruit> fruitBox = new Boxs1<Fruit>();
        Boxs1<Apple> appleBox = new Boxs1<Apple>();
        Boxs1<Toy> toyBox = new Boxs1<Toy>();

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());  // void add(Fruit item)
        fruitBox.add(new Grape());

        appleBox.add(new Apple());
        appleBox.add(new Apple());

        toyBox.add(new Toy());

        System.out.println(fruitBox);
        System.out.println(appleBox);
        System.out.println(toyBox);


    }
}
class Fruit{public String toString() {return "Fruit";}}
class Apple extends Fruit{public String toString() {return "Apple";}}
class Grape extends Fruit{public String toString() {return "Grape";}}
class Toy extends Fruit{public String toString() {return "Toy";}}

class Boxs1<T> {
    ArrayList<T> list = new ArrayList<T>();
    void add(T item){
        list.add(item);}

    T get(int i) {
        return list.get(i);
    }

    int size() {
        return list.size();
    }

    public String toString() {
        return list.toString();
    }
}