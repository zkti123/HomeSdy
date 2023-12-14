package com.green.javaHome.sty.study_one.variable;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //<-정확하지는 않다. 실무에서 사용X 변수명만 변경가능

        System.out.print("두자리 정수를 하나 입력해주세요.>");
        String input = scan.nextLine(); //"1"문자열
        int num = Integer.parseInt(input); //문자열 "1" 정수로 바꿈

        System.out.println("입력내용:" + input);
        System.out.printf("num=%d\n", num);
    }
}
