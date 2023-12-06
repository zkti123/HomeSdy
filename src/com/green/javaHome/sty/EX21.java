package com.green.javaHome.sty;

public class EX21 {
    public static void main(String[] args) {
        int num = 9;
        int dan = 1;
        int nw = 2;
        for (int i = num; i >= nw; i--) {
            System.out.println(i + "단");
            for (int j = dan; j <= num; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println(); // 각 단마다 빈 줄 추가
        }
    }
}
