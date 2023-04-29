package com.green.java.sty;

import java.util.Scanner;

public class Project2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num = 0;
        int n = 0;
        while (true) {
            System.out.print("합정수를 입력하세요 ");
            String j = scanner.nextLine();
            num = Integer.parseInt(j);
            if (num == 0) {
                break;
            }
            sum += num;
            n++;

        }
        System.out.printf("합계는 %d입니다.평균은 %d입니다.", sum, (sum / n));

    }
}

