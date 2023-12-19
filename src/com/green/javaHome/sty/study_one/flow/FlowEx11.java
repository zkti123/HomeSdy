package com.green.javaHome.sty.study_one.flow;

import java.util.Scanner;

public class FlowEx11 {
    public static void main(String[] args) {
        int num = 0, sum=0;

        Scanner scan=new Scanner(System.in);
        System.out.print("숫자를 입력하세요.(예12345)>");
        num = scan.nextInt();
//        String temp = scan.nextLine();
//        num = Integer.parseInt(temp);


        while (num>0){
            sum += num%10;  //각 자릿수를 하나씩 뽑아내야되기 때문에
            //10으로 나눈다음에 그 몫만 계산하면 다음과 같이 한 자리씩 뽑아낼수 있다.

            num /= 10; //num = (int)
            //10으로 number을 나눠주어서 다음 자릿수로 넘어갈 수 있도록 한다.
            //1234를 입력 받았을 시
            //1234 -> 123 -> 12...
        }
        System.out.printf("각 자리수의 합 :"+ sum);
    }
}
