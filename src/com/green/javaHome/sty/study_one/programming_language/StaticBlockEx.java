package com.green.javaHome.sty.study_one.programming_language;

public class StaticBlockEx {
    static int[] arr = new int[10];

    static {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10) + 1;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] : " + arr[i]);
        }
    }
}
