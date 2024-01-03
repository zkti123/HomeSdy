package com.green.javaHome.sty.study_one.arraylist;

import java.util.ArrayList;

public class ArrayListEx2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); //generic 제네릭 특정 타입으로 바꿔 준다.
//        list.add("11");
//        list.add(10.1);
//        list.add(true);
        //문자열 실수 불린 사용 불가 오로지 정수만 가능.
        list.add(10);
        list.add(13);

        int n1 = list.get(0);
        System.out.println(list);





        //Array리스트는 기본적으로 오브젝트 타입이기 때문에 형변환을 해줘야 된다.


    }
}
