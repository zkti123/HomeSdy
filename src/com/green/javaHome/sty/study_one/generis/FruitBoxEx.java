package com.green.javaHome.sty.study_one.generis;

import java.util.ArrayList;

class Fruit1{public String toString() {return "Fruit";}}
class Apple1 extends Fruit1{public String toString() {return "Apple";}}
class Grape1 extends Fruit1{public String toString() {return "Grape";}}

class Juice {
    String name ;

    Juice(String name) {
        this.name = name + "Juice";
    }

    public String toString() {
        return name;
    }

}
class Juicer{
    static Juice makeJuice(FruitBox<? extends Fruit1> boxEx) {
        String tmp = "";
        for (Fruit1 f : boxEx.getList()) {
            tmp += f + " ";
        }
        return new Juice(tmp);
    }
}

public class FruitBoxEx {
    public static void main(String[] args) {
        FruitBox<Fruit1> fruitBoxEx = new FruitBox<Fruit1>();
        FruitBox<Apple1> apple1BoxEx = new FruitBox<Apple1>();

        fruitBoxEx.add(new Apple1());
        fruitBoxEx.add(new Grape1());

        apple1BoxEx.add(new Apple1());
        apple1BoxEx.add(new Apple1());

        System.out.println(Juicer.makeJuice(fruitBoxEx));
        System.out.println(Juicer.makeJuice(apple1BoxEx));


    }
}
class FruitBox<T extends Fruit1> extends Box1<T>{}

class Box1<T> {
    ArrayList<T> list = new ArrayList<T>();

    void add(T item) {
        list.add(item);
    }

    T get(int i) {
        return list.get(i);
    }
    ArrayList<T> getList(){
        return list;}
    int size() {
        return list.size();
    }

    public String toString() {
        return list.toString();
    }

}