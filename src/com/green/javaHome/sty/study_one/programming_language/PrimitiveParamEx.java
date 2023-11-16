package com.green.javaHome.sty.study_one.programming_language;

public class PrimitiveParamEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() x : " + d.x);

        chage(d.x);
        System.out.println("After chang(d.x)");
        System.out.println("main() : x = " +d.x);
    }

    static void chage(int x) {
        x = 1000;
        System.out.println("change() : " + x);
    }
}
class Data{int x ;}