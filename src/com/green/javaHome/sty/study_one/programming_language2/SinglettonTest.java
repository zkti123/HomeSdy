package com.green.javaHome.sty.study_one.programming_language2;

public class SinglettonTest {
    public static void main(String[] args) {
        // Singleton 클래스의 생성자로 객체를 생성하려고 시도
        Singleton s = new Singleton(); // 이 부분에서 컴파일 에러 발생: Singleton
        // 클래스의 생성자가 private으로 선언되어 외부에서의 직접적인 인스턴스화가 제한됨

        // Singleton 클래스의 정적 메서드 getInstance()를 통해 싱글톤 인스턴스를 가져옴
        Singleton s1 = Singleton.getInstance(); // 싱글톤 인스턴스를 가져와 변수 s1에 할당
    }
}

// 싱글톤 패턴을 구현한 클래스
final class Singleton {
    // 정적 변수 s는 Singleton 클래스의 유일한 인스턴스를 저장
    private static Singleton s = new Singleton();

    // 생성자: private으로 선언하여 외부에서의 직접적인 인스턴스화 방지
    public Singleton() {
    }

    // 정적 메서드 getInstance(): Singleton 클래스의 유일한 인스턴스를 반환
    public static Singleton getInstance() {
        // 처음 호출 시 s가 null일 때만 인스턴스 생성
        if (s == null) {
            s = new Singleton();
        }
        return s; // 생성된 싱글톤 인스턴스 반환
    }
}