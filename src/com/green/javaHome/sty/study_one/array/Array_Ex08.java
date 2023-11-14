package com.green.javaHome.sty.study_one.array;

import java.util.Arrays;

public class Array_Ex08 {
    public static void main(String[] args) {
        int[] code = {-4, -1, 3, 6, 11};
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            int tmp = (int) (Math.random() * code.length);
            arr[i] = tmp;
        }
        System.out.println(Arrays.toString(arr));
    }
}