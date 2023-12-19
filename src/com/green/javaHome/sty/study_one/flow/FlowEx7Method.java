package com.green.javaHome.sty.study_one.flow;

public class FlowEx7Method {
    public static void main(String[] args) {
        gugudan(4);
        System.out.println("-------------------");

        gugudan(2, 8);//파란색: 파라미터

        System.out.println("========================");
        gugudan(5, 7);//아규먼츠값

    }
    public static void gugudan(int sDan, int eDan){//인자,파라미터,매개변수
        for (int i = sDan; i <= eDan; i++) {
            gugudan(i);

        }
    }

    public static void gugudan(int gugudan){

        for(int i = 1; i<=9; i++){
            System.out.printf("%d X %d = %d\n", gugudan, i, (gugudan *i));

        }   System.out.println();

    }

}

