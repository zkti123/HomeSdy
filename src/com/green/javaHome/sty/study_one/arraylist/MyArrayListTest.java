package com.green.javaHome.sty.study_one.arraylist;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayListEx1 myList = new MyArrayListEx1();

        myList.add(10);
        myList.add(20);
        myList.add(30);

        myList.add(3,100);


        System.out.println(myList);
        System.out.println(myList.size());

        int v1 = myList.get(0);
        System.out.println(v1);

        for (int i = 0; i < myList.size(); i++) {
            int val = myList.get(i);
            System.out.println(val);
        }
        System.out.println("==========================");

        int sum = 0;
        for (int i = 0; i < myList.size(); i++) {
            int val = myList.get(i);
            sum += val;
        } System.out.println("sum : "+ sum);
    }
}
