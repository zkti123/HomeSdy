package com.green.javaHome.sty.study_one.generis;

public class Enum {
    public static void main(String[] args) {
        /*
        열거형
        -관련된 상수들을 같이 묶어 놓은것. java는 타입에 안전한 열겨형 을 제공.
        -열거형 정의 하는 방법
            EX))) enum 열거형이름{상수명1,상수명2...}
                class Unit{
                int x, y; //유닛의 위치
                Direction dir // 열거형 인스턴스 변수를 선언

                void init(){
                dir = Direction.EAST; //유닛의 방향을 EAST로 초기화
                   }
                }

         - 열겨형 상수의 비교에 == 와 compareTo()사용가능
         EX))) if(dir == Direction.EAST){
         x++}
         else if(dir > Direction.WEST{ // 에러 . 열거형 상수에 비교연산자 사용불가!!!
         }
         else if (dir.compareTo(Dircection.WEST) > 0 ){ // compareTo() 사용가능
         }


         -열거형의 조상 == Enum

         열거형에 멤버 추가하기
         - 불연속적인 열거형 상수의 경우, 원하는 값을 괄호()안에 적는다
         - 괄호()를 사용하려면 , 인스턴스 변수와 생성자를 새로 추가해 줘야 한다.
         -열거형의 생성자는 묵시적으로ㅗ private이므로, 외부에서 객체생성 불가.






         */
    }
}
