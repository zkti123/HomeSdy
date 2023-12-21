package com.green.javaHome.sty.study_one.flow;

import java.util.Scanner;

public class FlowEx19 {
    public static void main(String[] args) {
        System.out.print("현재 월을 입력하세요.(1~12)");
        Scanner scan = new Scanner(System.in);

        int mom = scan.nextInt();

        String season = " ";
        switch (mom){
            case 3 :
            case 4 :
            case 5 :
                season = "봄";
                break;
            case 6 :
            case 7 :
            case 8 :
                season = "여름";
                break;
            case 9 :
            case 10 :
            case 11 :
                season = "가을";
                break;
            case 12:
            case 1 :
            case 2 :
                season = "겨울";
                break;
            default:
                System.out.println("잘못된 입력");

        }
        if(!"".equals(season)){// equals 빈칸 값비교는 빈칸("")을 앞에 두기
            System.out.printf("현재의 계절은 %s입니다.", season);
        }

    }
}
