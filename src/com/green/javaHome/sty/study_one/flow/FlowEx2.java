package com.green.javaHome.sty.study_one.flow;

public class FlowEx2 {
    public static void main(String[] args) {
        //1~10사이의 값을 더하기
        int sum = 0;
        int num = 1;
        int number = 11;
        for (int i = num; i<number; i++){
            System.out.printf("sum : %d, i : %d\n", sum, i);
            //sum=sum +i;
            sum += i;
        }
        System.out.println("total - sum : "+sum);

    }
}
