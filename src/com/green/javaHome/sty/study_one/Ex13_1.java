package com.green.javaHome.sty.study_one;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex13_1 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance(); //현재 날짜와 시간으로 셋팅됨
        cal.set(2023, 9, 25);


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = sdf.format(cal.getTime());

        System.out.println("설정된 날짜: " + formattedDate);




            }
}
