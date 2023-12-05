package com.green.javaHome.sty;

public class EX21 {
    public static void main(String[] args) {
        for (int i = 9; i >= 2; i--) {
            System.out.println(i + "단");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println(); // 각 단마다 빈 줄 추가
        }
    }
}
