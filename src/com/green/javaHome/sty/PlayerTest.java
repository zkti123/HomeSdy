package com.green.javaHome.sty;

abstract class Player2 {// 추상클래스(미완성 클래스,설계도)
    abstract void play(int pos);//추상 메서드(미완성 메서드)
    abstract void  stop();//추상메서드 (선언부만 있고 구현부{}가 없는 메서드 )
}
//추상 클래스는 상속을 통해 완성해야 객체 생성가능
abstract class AudioPlayer5 extends Player{
    void play(int pos) {

    }
    void stop(){}
}
public class PlayerTest {
    public static void main(String[] args) {
        // Player p =new Player();
//        AudioPlayer ap = new AudioPlayer();
        Player ap = new AudioPlayer5() {
            @Override
            void play() {

            }
        };
    }
}
