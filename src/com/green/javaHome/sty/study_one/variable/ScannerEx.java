package com.green.javaHome.sty.study_one.variable;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("이름 입력");

        String name = scan.next();

        int age = 27;

        System.out.println("나의 이름은 "+name+"이고 나이는 " + age +"살 입니다");
    }
}
