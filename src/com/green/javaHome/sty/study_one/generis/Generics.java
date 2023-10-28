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
        - Box<T> 제네릭 클래스 'T의 Box'또는 'T Box'라고 읽는다.
        - T 타입 변수 또는 타입 매개변수(T는 타입문자)
        -Box 원시 타입(raw tyoe)
        -타입의 안정성을 제공한다
        -타입체크와 형변환을 생략 할 수 있으므로 코드가 간결해진다.

         */
        ArrayList<Object> list = new ArrayList<Object>();
        list.add(10);
        list.add(20);
        list.add("30");

     //   Integer i = (Integer) list.get(2); // 형변환 에러 컴파일러의 한계
        String i =(String) list.get(2); // 형변환 생략 가능 object 들어가면 형변환 해야됨
        System.out.println(list);
        /*
        제네릭스 제약
        -타입 변수에 대입은 인스턴스 별로 다르게 가능
        -static 멤버에 타입 변수 사용불가
        -배열 생성할 때 변수 사용 불가. 타입변수로 배열 선언은 가능
         */

        /*
        와일드 카드 <?>
        -하나의 참조 변수로 대입된 타입이 다른 객체를 참조 가능
        <? extends T> 와일드 카드의 상한 제한. T와 그 자손들만 가능
        <? super T> 하한제한. T와 그조상들만 가능
        <?> 제한없음 모든타입 가능<? extends object> 와 동일

         */





    }
}
