package com.green.javaHome.sty.study_one.method;

public class Time {
    //멤버필드 중에 public 쓸 수 있는 건 상수만 가능.

    private  int hour;
    private  int minute;
    private  int second; //값넣는 방법 : 생성자를 이용해서 값넣는다 최초만 가능
    //메소드(setter)를 통해서 넣을수 있다.
    // 값 뺄 때는 메소드만 가능

    public int getHour() {

        return hour;
    }

    public void setHour(int hour) {
        if (hour > 0&& hour<24){
            this.hour = hour;}
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
}
