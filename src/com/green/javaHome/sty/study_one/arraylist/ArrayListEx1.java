package com.green.javaHome.sty.study_one.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        List list = new ArrayList();//대문자로 시작하고 타입이 다른데 주소값을 담을 수있으면 상속관계
        list.add(10); //0번방
        list.add(20); //번방
        list.add("add");

        Object obj = 10;

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        int n1 = (int) list.get(0);
        int n2 = (int) list.get(1);
        String str1 = (String) list.get(2);

        //Array리스트는 기본적으로 오브젝트 타입이기 때문에 형변환을 해줘야 된다.
        //수정이 많으면 Linkedlist 쓰는게 좋고 읽는거만 한다면 Arraylist가 좋다.
        //list는 object 타입
        //
    }
}
