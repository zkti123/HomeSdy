package com.green.javaHome.sty.study_one.flow;

import java.util.Scanner;

public class WhileEx2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input, answer;
        answer = (int)(Math.random()*100)+1;



        while (true){
            System.out.print("1~100사이의 정수를 입력:");
            input = scan.nextInt();

            if(input==0){break;}

            if (input>answer){
                System.out.println("down");
            }else if (input < answer){
                System.out.println("up");
            }
        }System.out.println("good");


    }
}
