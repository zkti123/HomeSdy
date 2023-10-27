package com.green.javaHome.sty.study_one.collections_framework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashestEx4 {
    public static void main(String[] args) {
        Set set = new HashSet<>();

        set.add("abc");
        set.add("abc");
        set.add(new Person("David", 10));
        set.add(new Person("David", 10));
        System.out.println(set);

    }
}

class Person{
    String name;
    int age;

//    @Override
//    public String toString() {Arr
//        return "Person{" +"name='" + name + '\'' + ", age=" + age +'}';
//    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public  String  toString() {
        return name +":" + age;
    }

}