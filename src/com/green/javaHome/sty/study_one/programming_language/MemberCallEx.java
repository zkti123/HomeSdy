package com.green.javaHome.sty.study_one.programming_language;

public class MemberCallEx {
    int iv = 10;
    static int cv = 20;

    int iv2 = cv;
    // static int cv2 = iv ;  << 에러 클래스변수는 인스턴스 변수를 사용할 수 없음.
    static int cv2 = new MemberCallEx().iv; // << 객체 생성을 해야만 사용가능

    static void staticMethod1() {
        System.out.println(cv);
//        System.out.println(iv);       <<  에러 클래스 메서드에서 인스턴스 변수를 사용불가.
        MemberCallEx c = new MemberCallEx();
        System.out.println(c.iv);  // << 객체 생성후 인스턴스 변수의 참조가능.

    }

    static void staticMethod2() {
        staticMethod1();
//        instanceMethod1();  <<에러 클래스 메서드에서 인스턴스메서드 호출할수 없음.
        MemberCallEx c = new MemberCallEx();
        c.instanceMethod1();  //<< 인스턴스 객체를 생성해야 호출가능
    }
    void instanceMethod1() {  //인스턴스에서는 인스턴스메서드와 클래스메서드 모두 인스턴스 생성없이 바로 호출이 가능.
        staticMethod1();
        instanceMethod1();
    }
}
