package com.green.javaHome.sty.method;

public class StaticMathod1 {
    public static void main(String[] args) {

        System.out.println();

    }

}


class TestClass2{
    int iv;         //인스턴스 변수
    static int cv;  // 클래스 변수



    void instanceMethod(){        //인스턴스 메서드
        System.out.println(iv);  //인스턴스 변수를 사용할 수 있다.
        System.out.println(cv); // 클래스 변수를 사용할 수 있다.

    }

    static void statiMethod(){  //static 메서드
//        System.out.println(iv);  << iv 에러 인스턴스 변수를 사용 할 수 없다.
        System.out.println(cv); //클래스 변수는 사용할수 있다.
    }


}
