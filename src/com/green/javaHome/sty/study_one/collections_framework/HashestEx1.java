package com.green.javaHome.sty.study_one.collections_framework;

import java.util.*;

public class HashestEx1 {
    public static void main(String[] args) {
        Object[] object = {"1", 1, "2", "2", "3", "3", "4", "4", "4"};
        Set set = new HashSet<>();

        for (int i = 0; i < object.length; i++) {
            set.add(object[i]);
        }
        System.out.println(set);
    }
}
