package com.green.javaHome.sty.study_one.collections_framework;

import java.util.*;

public class IteratorEx1 {
    public static void main(String[] args) {
        Collection list = new HashSet<>();
//        HashSet list = new HashSet<>();
//        ArrayList list = new ArrayList<>();  //set 은 Collection의 자손
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        Iterator it = list.iterator(); // iterator  1 회용 이라 다시 얻어와야한다

        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);

        }
//
//        for (int i = 0; i<list.size(); i++) {
//            Object obj = list.get(i);
//            System.out.println(obj);
//
//        }
    }
}
