package com.green.javaHome.sty.study_one.collections_framework;

import java.util.ArrayList;
import java.util.List;

public class Ex11_ArrayListEx {
    public static void main(String[] args) {
        final int LIMIT = 10;
        String source = "0123456789abcdefghijaABCDEFGHIJ!@#$%^&*()ZZZ";
        int length = source.length();

        List list = new ArrayList<>(length / LIMIT + 10);

        for (int i = 0; i < length; i += LIMIT) {
            if (i + LIMIT < length) {
                list.add(source.substring(i, i + LIMIT));
            }else {
                list.add(source.substring(i));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
