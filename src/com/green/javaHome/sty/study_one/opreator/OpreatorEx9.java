package com.green.javaHome.sty.study_one.opreator;

import java.util.Scanner;

public class OpreatorEx9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = "배성현";
        System.out.print("이름 입력:");
        String str = scan.nextLine();

        System.out.print("나이 입력:");
        String Age = scan.nextLine();
        int age = Integer.parseInt(Age);

        System.out.print("사는곳:");
        String s1 = scan.nextLine();

        System.out.printf("나의 이름은 %s 이고 나이는 %d살 이며 사는 곳 은 %s입니다.", name, age, s1);
        scan.close();

    }
}
