package com.green.javaHome.sty.study_one.programming_language;

public class PowerTestEx2 {
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        long result = 0;


        for (int i = 0; i <= n; i++) {
            result += power2(x, i);
        }
        System.out.println(result);
    }

    static long power2(int x, int n) {
        if (n == 0) {
            return 1; // 0승은 항상 1이므로 1을 반환
        } else {
            return x * power2(x, n - 1); // 재귀적으로 x의 n승을 계산
        }
    }
}
