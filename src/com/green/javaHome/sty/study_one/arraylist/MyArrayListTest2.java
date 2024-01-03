package com.green.javaHome.sty.study_one.arraylist;

public class MyArrayListTest2 {
    public static void main(String[] args) {
        MyArrayListEx1 myList = new MyArrayListEx1();
        myList.add(10);
        myList.add(22);
        myList.add(4);
        myList.add(200);
        myList.add(53);
        myList.add(96);


        System.out.println(myList);
        myList.bubbleSort();

    }
}
