package com.green.javaHome.sty.study_one;

public class Ex07 {
    public static void main(String[] args) {

        Outer2 oc = new Outer2();  // 외부 클래스의 인스턴스를 먼저 생성해야 인스턴스 클래스의
        Outer2.InstanceInner li = oc.new InstanceInner(); // 인스턴스생성가능

        System.out.println("li.iv : "+ li.iv);
        System.out.println("Outer2.StaticInner.cv : " + Outer2.staticInner.cv);

//        스태틱 내부 클래스의 인스턴스는 외부 클래스를 먼저 생성하지 않아도 된다.
        Outer2.staticInner si = new Outer2.staticInner();
        System.out.println("si.iv : " + si.iv);
    }
}

class Outer2{
    class InstanceInner {
        int iv = 100;
    }

    static class staticInner {
        int iv = 200;
        static int cv = 300;

    }

    void myMethod() {
        class LocalInner {
            int iv = 400;
        }
    }

}
