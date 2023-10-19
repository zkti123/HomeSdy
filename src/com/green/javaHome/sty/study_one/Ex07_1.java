package com.green.javaHome.sty.study_one;

class Outer3{
    int value = 10;

    class Inner{
        int value = 20;

        void method() {
            int value = 30;
            System.out.println("value : " + value);
            System.out.println("this.value : " + this.value);
            System.out.println("Outer3.this.value : " + Outer3.this.value);
        }

    }
}
public class Ex07_1 {
    public static void main(String[] args) {
        Outer3 outer = new Outer3();
        Outer3.Inner inner = outer.new Inner();
        inner.method();
    }
}
