package com.green.javaHome.sty.study_one.method;

public class TvTest2 {
    public static void main(String[] args) {
        Tv2 tv = new Tv2();//Tv2 클래스 객체화

        for (int i = 0; i < 10; i++) {
            tv.channelUp();

        }
        System.out.printf("channel : %d\n", tv.channel);

        for (int i = 0; i < 10; i++) {
            tv.channelDown();

        }
        System.out.printf("channel : %d\n", tv.channel);

    }
}
class Tv2{

    String color;
    boolean power;
    int channel;

    final int MAX_CHANNEL = 5;

    void power(){power = !power;}
    void channelUp() {
        if (channel<MAX_CHANNEL){
            ++channel;
        }
    }


    final int MIN_CHANNEL = 1;

    void channelDown(){
        if (channel>MIN_CHANNEL){
            --channel;
        }
    }

}

