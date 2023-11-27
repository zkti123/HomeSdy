package com.green.javaHome.sty.study_one.programming_language2;

import java.io.PrintStream;

public class Quik1 {
    public static void main(String[] args) {
        int[] arr = new int[]{13, 4, 5, 63, 6};
        printArr(arr);
        quikSort(arr, 0, arr.length - 1);
        System.out.println("정렬된 배열");
        printArr(arr);
    }

    public static void printArr(int[] arr) {
        for (int value : arr) {
            System.out.print(value+" ");
        }
    }

    public static int patition(int[] arr, int low, int high
    ) {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int tmp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = tmp;

        return i + 1;
    }


    public static void quikSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = patition(arr, low, high);
            quikSort(arr, low, pi - 1);
            quikSort(arr, low + 1, high);
        }
    }
}
