package com.green.javaHome.sty.study_one.array;

public class Array_Ex11 {
    public static void main(String[] args) {
        String[] names = {"Kim", "Park", "Yi"};

        for (int i = 0; i < names.length; i++) {
            System.out.println("name[" + i + "] : " + names[i]);
        }
        String tmp = names[2];
        System.out.println("tmp : " + tmp);
        names[0] = "Yu";
        for (String str : names) {
            System.out.println(str);
        }
    }
}