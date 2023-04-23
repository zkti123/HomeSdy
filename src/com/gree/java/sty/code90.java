package com.gree.java.sty;

public class code90 {

    public static int ThanValue(int a, int... v){
        int sum = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i]>=a)
                sum += v[i];
        }return sum;
    }

    public static void main(String[] args) {
        int largerSum;
        largerSum = ThanValue(10,5,3,11,17,2,20,15);
        System.out.println("sum :"+largerSum);
    }



}
