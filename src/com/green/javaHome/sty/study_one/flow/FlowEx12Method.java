package com.green.javaHome.sty.study_one.flow;

import java.util.Scanner;

public class FlowEx12Method {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 입력하세요.(예12345)>");
        String temp = scan.nextLine();
        int sum = sumStringNumber(temp);//리턴 타입
        System.out.printf("각 자리수의 합 : %d\n", sum);


    }

    public static int sumStringNumber(String str) {//public static int 부분이 int는 반환부분 (String str)은 불러오는 부분
        int val = Integer.parseInt(str);
        int sum = 0;
        while (val > 0) {
            sum += val % 10;

            val /= 10;
        }

        return sum;
    }
}
