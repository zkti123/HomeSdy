package com.green.javaHome.sty.study_one.variable;

public class VariableNumber {
    public static void main(String[] args) {
        //변수 정수형
/*      byte b1;    //1byte
        short s1;   //2byte
        int i1;     //4byte
        long l1;    //8byte

*/
        //변수 숫자형 int가 변수타입 ,변수명

        int a,b; //정수형 변수 선언
        double c; //실수형 변수 선언
        char d; //문자하나 쓸때 char 선언
        String s; // 문자열 변수선언
        a = 10; // '=' 대입 연산자, 오른쪽값 복사후 왼쪽에 대입 , 초기화
        b = 8;
        c = 3.14;
        d = '한';
        s = "문자열";
        System.out.println(a+b);
        System.out.println(d);
        System.out.println(s);
        a = 20; //a값 초기화
        System.out.println(a);
        System.out.println(a+c);
        c = 4.14; // 실수형 변수 선언 , c값 초기화
        System.out.println(a+c);
    }
}
