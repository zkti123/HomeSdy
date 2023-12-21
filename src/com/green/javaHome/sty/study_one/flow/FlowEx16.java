package com.green.javaHome.sty.study_one.flow;

public class FlowEx16 {
    public static void main(String[] args) {
        Loop1:
        for (int i = 2; i<=9; i++){
            for (int z =1; z<=9; z++){
                if(z==5){
                    break Loop1;}
                System.out.printf("%d,%d\n",i, z);
            }

        }

    }
}
