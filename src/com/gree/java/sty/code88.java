package com.gree.java.sty;

import java.util.Arrays;

public class code88 {
    public static int[] makeArray(int size) {


    int a[] = new int[size];
        for (int i = 0; i < size; i++)
            a[i]  = i*i;
            return a;
        }

    public static void main(String[] args) {
        int s = 5;
        int[] B = makeArray(s);
        for (int i = 0; i < B.length; i++) {
            System.out.println(B[i]);
        }
    }

}
