package com.green.javaHome.sty.study_one.programming_language2;

public class CastingTest3 {
    public static void main(String[] args) {
        Car car = new FireEngine(); // Car 타입의 변수 car가 FireEngine 객체를 참조
        Car car2 = null;
        FireEngine fe = null;

        car.drive(); // FireEngine 클래스의 drive() 메서드 호출

        fe = (FireEngine) car; // 다운캐스팅 시도
        fe.drive(); // FireEngine 클래스의 drive() 메서드 호출

        car2 = new FireEngine(); // FireEngine 객체를 Car 타입으로 업캐스팅
        car2.drive(); // 다형성을 통해 FireEngine의 drive() 메서드가 호출됨
    }
}
