package com.green.javaHome.sty.study_one;

import java.util.Calendar;

public class Ex10_2 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance(); //현재 날짜와 시간으로 셋팅됨
        int thisYear = cal.get(Calendar.YEAR);
        int lastDayOfMonth = cal.getActualMaximum(Calendar.DATE);

        System.out.println(thisYear);
        System.out.println(lastDayOfMonth);
    }
}
