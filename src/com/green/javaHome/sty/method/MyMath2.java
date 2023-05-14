package com.green.javaHome.sty.method;

public class MyMath2 {
    long c, l; //<<<<인스턴스 변수

    long add(){
        return c+l;   /// <<< 인스턴스 메서드
    }

    static long add(long a , long b){
        return a+b;    ////// <<<<<< 클래스 메서드(static 메서드)
    }

}
class MyMathTest2{
    public static void main(String[] args) {
        System.out.println(MyMath2.add(400L, 100L)); //<<<< 클래스 메서드 호출

        MyMath2 mm = new MyMath2();  //인스턴스 생성
        mm.c = 200L;
        mm.l = 100L;
        System.out.println(mm.add()); // <<<< 인스턴스 메서드 호출
    }
}
