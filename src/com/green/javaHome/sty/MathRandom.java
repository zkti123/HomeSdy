package com.green.javaHome.sty;

import java.util.Random;

public class MathRandom {
    public static void main(String[] args) {
        boolean[] used = new boolean[32]; // 인덱스 1부터 30까지 사용하기 위해 31 크기의 배열 생성

        Random random = new Random();
        int count = 0;

        while (count < 30) { // 30개의 숫자를 출력할 때까지 반복
            int num = random.nextInt(31) + 1; // 1부터 30까지의 랜덤한 숫자 생성

            if (!used[num]) { // 해당 숫자가 사용되지 않았으면 출력
                System.out.println(num);
                used[num] = true; // 숫자 사용 표시
                count++;
            }
        }
    }
}
