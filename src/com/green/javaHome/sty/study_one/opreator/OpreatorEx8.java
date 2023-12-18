package com.green.javaHome.sty.study_one.opreator;

import java.util.Scanner;

public class OpreatorEx8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("숫자를 입력");
        int num = scan.nextInt();

        System.out.println("num : "+ num);

        String c;
        String a = "짝수";
        String b = "홀수";

        c = (num %2==0) ? a : b;


        System.out.printf(c);

        //String result = num %2==0 ? "짝수" : "홀수";
        //System.out.printf("숫자 %d는 %s이다", num, result);




        //num값이 홀수면 "홀수" 짝수면 "짝수"출력


    }
}
