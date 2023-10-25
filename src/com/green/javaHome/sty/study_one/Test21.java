package com.green.javaHome.sty.study_one;

import java.util.Scanner;

public class Test21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("과일 이름을 입력하세여");
        String fruits = scanner.nextLine();

        boolean apple = check(fruits);
        System.out.println("사과입니까? " +apple);
    }

    public static Boolean check(String fruits){
        return "사과".contains(fruits);
    }

}
