package com.green.javaHome.sty.study_one;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex10_13 {
    public static void main(String[] args) {
        //날짜와 시간을 다양한 형식으로 출력 할 수 있게 해준다.
        Date today = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        String result = df.format(today);
        System.out.println(result);

        //특정 형식으로 되어있는 문자열에서 날짜와 시간을 뽑아낼 수도 있다.
        DateFormat df1 = new SimpleDateFormat("yyyy년 MM월 dd일");
        DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");

        try {
            Date d = df1.parse("2023년 10월 18일");
            System.out.println("d :" +d); //문자열을 Date로 변환
            String result1 = df2.format(d);
            System.out.println("result1 : " +result1);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
