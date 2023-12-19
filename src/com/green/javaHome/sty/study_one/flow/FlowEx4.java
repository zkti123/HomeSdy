package com.green.javaHome.sty.study_one.flow;

public class FlowEx4 {
    public static void main(String[] args) {
        int star = 5;

        for (int i = 0; i <= star; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
