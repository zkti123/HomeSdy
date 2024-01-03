package com.green.javaHome.sty.study_one.arraylist;

public class MyArrayListEx1 {
    private int[] items;

    public int size() {
        return items.length;
    }

    public int get(int idx) {

        return items[idx];
    }

    public MyArrayListEx1() {
        items = new int[0];


    }


    public void add(int value) {
        int[] temp = new int[items.length + 1];
        temp[items.length] = value;
        for (int i = 0; i < items.length; i++) {
            temp[i] = items[i];
        }
        items = temp;
    }

    @Override
    public String toString() {
        String str = "[";
        if (items.length > 0) {
            str += items[0];
            for (int i = 1; i < items.length; i++) {
                str += ", " + items[i];
            }
        }
        str += "]";
        return str;
    }

    public void add(int num, int as) {
        if (num > items.length) {
            return;
        }

        int[] temp = new int[items.length + 1];
        temp[num] = as;
        for (int i = 0; i < items.length; i++) {
            if (i < num) {
                temp[i] = items[i];
            } else {
                temp[i + 1] = items[i];
            }
        }
        items = temp;


    }

    public void bubbleSort() {
        int tmp = 0;

        for (int i = items.length - 1; i > 0; i--) {
            for (int j = 0; j < items.length - i; j++) {
                if (items[j] > items[j + 1]) {
                    tmp = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = tmp;
                }

            }

        }
        System.out.println(toString());
    }


    public boolean contains(int i) {
        for (int j = 0; j < items.length; j++) {
            if (i == items[j]) {
                return true;
            }
        }return false;
    }

    public void set(int v, int c) {
        this.items[v] = c;
    }
}
