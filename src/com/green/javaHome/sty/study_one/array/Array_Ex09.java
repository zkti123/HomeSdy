package com.green.javaHome.sty.study_one.array;

import java.util.Arrays;

public class Array_Ex09 {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] = (int) (Math.random() * 10));

        }
        System.out.println();

        for (int i = 0; i < numArr.length-1; i++) {
            boolean changed = false;
            for (int j = 0; j < numArr.length-1-i; j++) {
                if (numArr[j] > numArr[j+1]) {
                    int temp = numArr[j];
                    numArr[j] = numArr[i+1];
                    numArr[i+1] = temp;
                    changed = true;
                }
            }
            if (!changed) {
                break;
            }
            for (int j = 0; j < numArr.length; j++) {
                System.out.print(numArr[j]);
            }
            System.out.println();
        }
    }
}