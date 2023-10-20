package com.green.javaHome.sty.study_one;

public class TryEx08_2 {
    public static void main(String[] args) {
        try {
            Exception e = new Exception();
            throw e;
        } catch (Exception e) {
            System.out.println("에러 메세지 : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램이 정상 종료되었음");
    }


}
