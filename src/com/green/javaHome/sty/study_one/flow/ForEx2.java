package com.green.javaHome.sty.study_one.flow;

public class ForEx2 {
    public static void main(String[] args) {
        //for( 초기화  ; 조건식  ; 증감식 ) 실행순서 : 1>2>S>3>2>s>3
        for (int a = 21; a >= 18; a--) {
            System.out.println("a");

        }
        for (int i =0; i<5; i++){
            System.out.println(i+1);
        }


        for (int i =5; i<10; i++){
            System.out.print(i-4);
            System.out.print(", ");

        }
    }
}
