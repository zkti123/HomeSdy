package com.green.javaHome.sty.study_one.flow;

import java.util.Scanner;

public class FlowEx15Method {
    public static void main(String[] args) {
        int input , answer ;

        Scanner scan = new Scanner(System.in);
        answer = getRandomNumber(1,100);
        System.out.println(answer);

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
    public static int getRandomNumber(int min, int max ){

        int ho = (int) (Math.random()*(max-min+1))+min;

        return ho;}
    }
