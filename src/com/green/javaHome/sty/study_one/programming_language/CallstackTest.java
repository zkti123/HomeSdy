package com.green.javaHome.sty.study_one.programming_language;

public class CallstackTest {
    public static void main(String[] args) {
        firstMethod();  //static 메서드는 객체 생성없이 호출가능하다.
    }

    static void firstMethod() {
        secondMethod();
    }

    static void secondMethod() {
        System.out.println("secondMethod");
    }
}
