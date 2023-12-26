package com.green.javaHome.sty.study_one.method;

public class MyMethodTest {
    public static void main(String[] args) {

        MyMethod mm = new MyMethod();
        mm.sum(10,20);
        mm.sum(10,40);//여러번 사용이 가능하다.
        //void 메서드는 양쪽에 뭘 붙일수 없다.

        int result = mm.sum2(10,245);
        System.out.println("result : "+result);

        //PrintStream ps = System.out; ==> PrintStream 객체 주소 값 만 담을수 있다.
        //ps.println("result : " +result);  sout와 같다

    }
}
