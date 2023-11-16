package com.green.javaHome.sty.study_one.programming_language;

public class CallstackTest2 {
    public static void main(String[] args) {
        System.out.println("main(string[] args)이 시작되었음");
        firstMethod();  //static 메서드는 객체 생성없이 호출가능하다.
        System.out.println("main(string[] args)이 끝났음");
    }

    static void firstMethod() {
        System.out.println("firstMethod()시작되었음");
        secondMethod();
        System.out.println("firstMethod()끝났음");
    }

    static void secondMethod() {
        System.out.println("secondMethod()이 시작되었음");
        System.out.println("secondMethod()이 끝났음");
    }
}
