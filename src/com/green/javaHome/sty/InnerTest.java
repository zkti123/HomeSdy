package com.green.javaHome.sty;

class AAA {
    int i =100;
    BBB b = new BBB();
    class BBB {
        void method(){
//            AAA a = new AAA();
//            System.out.println(a.i);
            System.out.println(i); //객체 생성없이 외부 클래스의 멤버 접근가능.
        }
    }

}


//class CCC {
//    BBB b = new BBB();
//}


public class InnerTest {
    public static void main(String[] args) {
//        BBB b = new BBB();
//        b.method
    }
}
