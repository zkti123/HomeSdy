package com.green.javaHome.sty.study_one.flow;

import java.util.Scanner;

public class WhileEx1 {
    public static void main(String[] args) {
        //do -while 문
        //while 조건식 검증 부터 true여야 실행
        // do while 일단 안쪽 do{} 에서 먼저 실행 한후 검증
        int input , answer ;

        Scanner scan = new Scanner(System.in);

        answer = (int)(Math.random()*100)+1;

        System.out.print("1~100사이의 정수를 입력 :");
        input= scan.nextInt();


        while(input != answer){
            System.out.print("1~100사이의 정수를 입력 :");
            input = scan.nextInt();
            if (input>answer){
                System.out.println("down");
            } else if (input<answer) {
                System.out.println("up");
            }else {
                System.out.println("good");
            }

        }
    }
}
