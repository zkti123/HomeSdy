package com.green.javaHome.sty.study_one.collections_framework.arrays;

import java.util.ArrayList;
import java.util.List;

public class ArraysEx11_3 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>(5);
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        list.trimToSize(); //<= 빈공간을 없앤다(용량과 크기가 같아진다)
        System.out.println("======after trimToSize()======");
        print(list);

        list.ensureCapacity(6);
        System.out.println("=====After ensureCapacity(6)=====");
        print(list);


        while (list.size() < 7) {
            list.add(5); // 0 또는 다른 값을 추가하여 크기를 조절할 수 있습니다.
        }
        System.out.println("=====After setSize(7)======");
        print(list);

        list.clear();
        System.out.println("====After clear======");
        print(list);
    }

    public static void print(List<Integer> list) {
        System.out.println(list);
        System.out.println("Size : " + list.size());


    }

}
