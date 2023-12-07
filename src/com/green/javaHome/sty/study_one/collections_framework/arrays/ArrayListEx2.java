package com.green.javaHome.sty.study_one.collections_framework.arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx2 {
    public static void main(String[] args) {
        final int LIMIT = 10;
        String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()zzz";

        int lenght = source.length();

        List list = new ArrayList<>(lenght / LIMIT + 10); // 크기를 여유있게 잡는다

        for (int i = 0; i < lenght; i+=LIMIT) {
            if (i + lenght < lenght) {
                list.add(source.substring(i, i + lenght));
            } else {
                list.add(source.substring(i));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
