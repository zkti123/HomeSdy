package com.green.javaHome.sty.study_one.variable;

public class PrintfEx1 {
    public static void main(String[] agrs) {
        byte b = 1;
        short s = 2;
        char c ='A';
        int finger = 10;

        System.out.printf("b=%d\n", b);
        System.out.printf("s=%d%n", s);
        System.out.printf("c=%c, %d %n", c, (int)c);
        System.out.printf("finger=[%5d] \n", finger);//  \ => 이스케이프 문자 개행문자
        System.out.printf("finger=[%-5d] \n", finger);
        System.out.printf("finger=[%05d] \n", finger);
    }
}
