package com.green.javaHome.sty.study_one.lambda_stream;

public class Lambda {
    public static void main(String[] args) {
        /*
        람다식
        -함수(메서드)를 간단한 '식'으로 표현하는 방법
        -익명 함수

        함수와 메서드의 차이
        -근본적으로 동일. 함수는 일반적용어, 메서드는 객체지향개념 용어
        - 함수는 클래스에 독립적, 메서드는 클래스에 종속적

        1. 메서드의 이름과 반환타입을 제거하고 '->' 를 블롤{}앞에 추가한다
        EX)) int max(int a, int b){            (int a, int b ) ->{return a > b ? a :b'}
                return a>b ? a:b ;   =>>>>>
        }
        2.반환값이 있는 경우, 식이나 값만 적고 return문 생략가능 (끝에 ';'안붙음)
        EX)) (int a, int b) ->{return a>b? a:b;}  ===>>>> (int a, int b)-> a>b? a:b

        3.매개변수의 타입이 추론가능하면 생략가능 ( 대부분의 경우 생략가능)
        (int a, int b)-> a>b? a:b  ====>>>>>   (a,b)-> a>b? a:b

        람다식 작성시 주의사항
        1. 매개변수가 하나인 경우, 괄호() 생략가능(타입이 없을 떄만)
        EX)) a-> a*a   // 가능
            int a-> a*a // 불가능 에러
        2.블록 안의 문장이 하나뿐 일 때, 괄호{}생략가능(끝에';'안 붙임)
            (int i ) -> System.out.print(i)

        -람다식은 익명 함수가 아니라 익명 객체이다.
        - 람다식을 다루기 위한 참조변수가 필요. 참조변수의 타입은? 함수형 인터페이스

        함수형 인터페이스
        - 단 하나의 추상메서드만 선언된 인터페이스
        EX)) interface MyFunction{
                public abstract int max(int a, int b);
                }
>>>>>>>>>>>>>
                MyFunction f = new MyFunction(){
                   public int max(int a , int b){
                        return a>b ? a:b;
                }
             };

         함수형 인터페이스 타압의 참조변수로 람다식을 참조하 수 있음.
         (단, 함수형 인터페이스의 메서드와 람다식의 매개변수 개수와 반환타입이 일치해야함.)
            EX))) MyFunction f = (a,b)-> a>b? a:b;
            int value = f.max(3,5);  // 실제로는 람다식(익명 함수)이 호출됨


         */
    }
}
