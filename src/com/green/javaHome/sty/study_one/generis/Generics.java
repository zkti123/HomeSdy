package com.green.javaHome.sty.study_one.generis;

import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {
        /*
        -컴파일시 타입을 체크해 주는 기능(complie - time type check)
        타입변수
        -클래스를 작성할 때, Object 타입 대신 타입변수(E)를 선언해서 사용
        -객체 생성시, 타입변수(E)대신 실제 타입(tv)을 지정 (대입)
        ex)) ArrayList<tv> list = new ArrayList<tv>();
        -타입 변수 대신 실제 타입이 지정되면, 형변환 생략 가능.

         */
        ArrayList<Object> list = new ArrayList<Object>();
        list.add(10);
        list.add(20);
        list.add("30");

     //   Integer i = (Integer) list.get(2); // 형변환 에러 컴파일러의 한계
        String i =(String) list.get(2); // 형변환 생략 가능 object 들어가면 형변환 해야됨
        System.out.println(list);
    }
}
