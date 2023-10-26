package com.green.javaHome.sty.study_one.collections_framework;

public class Iterator_ListIterator_Enumeration {
    /*
    -컬렉션에 저장된 데이터를 접근하는데 사용되는 인터페이스
    -Enumeration은 Iterator의 구버전
    -ListIterator는 Iterator의 접근성을 향상시킨 것(단반향 => 양방향)
    -컬렉션에 저장된 요소들을 일어 오는 방법을 표준화한 것. <= Iterator
    -걸렉션에 Iterator()를 호출해서 Iterator를 구현한 객체를 얻어서 사용 <= Iterator

    EX))  List list = new ArrayList();
           Iterator it = list.iterator(); <== iterator 객체를 반환

           while(it.hasNext()){ <=있는지 확인
                sout(it.next); <= 요소를 읽어오기
           }



    -boolean haNext() = 읽어 올 요소가 남아있는지 확인한다. 있으면 ture, 없으면 fales를 반환한다. <==확인
    -object next() - 다음 요소를 읽어 온다. next()를 호출하기 전에 hasnext()를 호출해서 읽어 올 요소가 있는지 확인하는 것이 안전하다. <=읽기
     */
}
