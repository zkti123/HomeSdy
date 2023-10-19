package com.green.javaHome.sty;


class A {
    public void method(I i) {
        i.method();
    }
}

interface I {
    public void method();
}


class B implements I{
    public void method() {
        System.out.println("B클래스의 메서드");
    }
}
class C implements  I{
    public void method() {
        System.out.println("C클래스의 메서드");
    }
}
public class IterpaceTest {
    public static void main(String[] args) {
        A a = new A();
        a.method(new C());

    }
}
