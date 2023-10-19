package com.green.javaHome.sty.study_one;

public class Outer {
    private int outerTv = 0;
    static int outerCv = 0;

    class InstanceInner {
        int iiv = outerTv; // 1.외부클래스의 private 멤버도 접근가능하다
        int iiv2 = outerCv;
    }

    static class StaticInner {
//        int siv = outerIv; 스태틱 클래스는 외부 클래스의 인스턴스멤버에 접근할 수 없다.
        static  int scv = outerCv;
    }

    void myMethod() {
        int iv = 0;
        final int LV = 0;  // JDK 1.8 부터 final 생략 가능
        class LocalInner {  // 2. 지역 내부 클래스를 감싸고 있는 메서드의 상수만 사용가능.
            int liv = outerTv;
            int liv2 = outerCv;
//       외부 클래스의 지역변수는 final 이 붙은 변수(상수)만 접근가능하다.
            int liv3 = LV; // (jdk1.8부터 에러아님)
            int liv4 = LV;
        }

    }
}
