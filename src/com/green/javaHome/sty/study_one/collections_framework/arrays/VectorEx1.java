package com.green.javaHome.sty.study_one.collections_framework.arrays;

import java.util.Vector;

public class VectorEx1 {
    public static void main(String[] args) {
        Vector v = new Vector<>(5);
        v.add("1");
        v.add("2");
        v.add("3");
        print(v);

        v.trimToSize();
        System.out.println("===After trimToSize()===");
        print(v);

        v.ensureCapacity(6);
        System.out.println("===After ensureCapacity(6)===");
        print(v);

        v.setSize(7);
        System.out.println("===After setSize(7)===");
        print(v);

        v.clear();
        System.out.println("===After clear()===");
        print(v);
    }

    static void print(Vector vector) {
        System.out.println(vector);
        System.out.println("size : " + vector.size());
        System.out.println("capacity : " + vector.capacity());

    }
}
