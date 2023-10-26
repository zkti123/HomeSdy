package com.green.javaHome.sty.study_one.collections_framework;

public class Ex11_LinkdList {
    public static void main(String[] args) {
        /* LinkdList - 배열의 장단점
        장점
         배열은 구조가 간단하고 데이터를 읽는 데 걸리는 시간(접근시간,access time)이 짧다.
        단점
          크기를 변경해야 하는 경우 새로운 배열을 생성 후 데이터를 복사해야함.
          크기 변경을 피하기 위해 충분히 큰 배열을 생성하면 메모리가 낭비됨.
          비순차적인 데이터의 추가, 삭제에 시간이 많이 걸린다.
          -데이터를 추가하거나 삭제하기 위해, 다른 데이터를 옮겨야함.
          -그러나 순차적인 데이터 추가(끝에 추가)와 삭제(끝부터 삭제)는 빠르다.

         */
        /* 배열의 단점을 보완
        -배열과 달리 LinkdList는 불연속적으로 존재하는 데이터를 연결(link)
        데이터의 삭제 : 단 한 번의 참조 변경만으로 가능.

        데이터의 추가 : 한번의 node객체 생성과 두 번의 참조변경만으로 가능.

        LinkdList :
         -연결리스트. 데이터 접근성이 나쁨 (불연속적) 한번에 가는건 불가능 다음순서로 순서대로 이동
        doubly linked list :
         - 이중 연결리스트, 접근성향상 앞뒤로 이동은 가능 한번에 이동 불가능
         doubly circular linked list:
         - 이중 원형 연결리스트 :
         한번에 이동 가능 끝과 처음으로 이동.

         자바는 이중 연결리스트로 되어있다

        1.순차적으로 데이터를 추가/삭제 - ArrayList가 빠름
        2.비순차적으로 데이터를 추가/삭제 - LinkedList가 빠름
        3.접근시간(acces time) - ArrayList가 빠름

        인덱스가 n인 데이터의 주소 = 배열의 주소+ n*데이터 타입의 크기

         */
    }
}
