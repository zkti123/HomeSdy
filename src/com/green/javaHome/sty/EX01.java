package com.green.javaHome.sty;

public interface EX01 {
    //추상 클래스 (abstract class)
    //미완성 설계도. 미완성 메서드를 갖고 있는 클래스

}
abstract class Player{
    abstract void play(); //{} 없으면 추상메서드 (미완성메서드)
    //다른 클래스 작성에 도움을 주기위한 것. 인스턴스 생성 불가.
    //Player p =new Player(); <=에러 인스턴스 생성 불과
}
class AudioPlayer extends Player{
    void play(int pos){} //추상메서드 구현
    void stop(){}

    @Override
    void play() {

    }
}
