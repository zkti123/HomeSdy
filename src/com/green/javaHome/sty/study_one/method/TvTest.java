package com.green.javaHome.sty.study_one.method;

public class TvTest {
    public static void main(String[] args) {

        Tv tv = new Tv();//tv객체의 주소값만 담을수있다.
        System.out.printf("power : %b\n",tv.power);//파워에 저장되어있는 걸 가져온다.(읽기)
        System.out.printf("channel : %d\n",tv.channel);


        tv.power = true;//쓰기
        System.out.printf("power : %b\n",tv.power);
        tv.power();
        System.out.printf("power : %b\n",tv.power);

        tv.channelUp();
        tv.channelUp();
        System.out.printf("channel : %d\n",tv.channel);
        tv.channel = 10;
        System.out.printf("channel : %d\n",tv.channel);

        Tv tv2 = tv;
        System.out.printf("channel : %d\n",tv2.channel);


    }
}
