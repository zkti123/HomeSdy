package com.green.javaHome.sty.study_one.flow;

import java.util.Scanner;

public class FlowEx14 {
    public static void main(String[] args) {
        int input , answer ;

        Scanner scan = new Scanner(System.in);

        answer = (int) (Math.random()*100)+1;



        do {
            System.out.print("1~100사이의 정수를 입력 :");
            input = scan.nextInt();
            if (input < answer) {
                System.out.println("up");
            } else if (input > answer) {
                System.out.println("down");
            }
        }while (input !=answer );
        System.out.println("good");





    }
}
