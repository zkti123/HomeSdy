package com.green.javaHome.sty.study_one.generis;

import java.util.ArrayList;
class Tv{}
class Audio{}
public class GenericsEx1 {
    public static void main(String[] args) {
       // ArrayList list = new ArrayList<>();
       ArrayList<Tv> list = new ArrayList<Tv>(); //Tv타입의 객체만 저장가능
        list.add(new Tv());
//      list.add(new Audio());

 //       Tv t = (Tv)list.get(0); // list의 첫번째 요소를 꺼낸다.형변환을 꼭 해줘야된다 ArrayList list = new ArrayList<>();

        Tv t = list.get(0); //형변환이 필요 없다 Tv타입이기 때문.
    }
}
