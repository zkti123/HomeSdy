package com.green.javaHome.sty.study_one.flow;

public class ForEx3 {
    public static void main(String[] args) {

        //for( 초기화  ; 조건식  ; 증감식 ) 실행순서 : 1>2>S>3>2>s>3
        //1,2,3,4,5


        for (int i = 1; i<6; i++){
            if (i <5){
                System.out.print(i);
            } else {
                System.out.print("," );
            }
        }
        System.out.println("/n---------------");

        for (int i = 1; i<6; i++){
            if (i>1){
                System.out.print(",");
            }
            System.out.print(i);
        }
    }
}
