package com.green.javaHome.sty.study_one.programming_language;

public class PowerTestEx {
    public static void main(String[] args) {
        int x = 2;
        int n = 4;
//        long result = 0;
        long result = calculatePowerSum(x, n);

        for (int i = 0; i <= n; i++) {
            result += power1(x, i);
        }
        System.out.println(result);
    }
    // 2의 0승부터 x의 n승까지의 합을 계산하는 메서드
    static long calculatePowerSum(int x, int n) {
        if (n == 0) {
            return 1; // 0승은 항상 1이므로 1을 반환
        } else {
            return power1(x, n) + calculatePowerSum(x, n - 1); // x의 n승을 계산하고 합을 재귀적으로 계산
        }
    }
    static long power1(int x, int n) {
        if (n == 0) {
            return 1; // 0승은 항상 1이므로 1을 반환
        } else {
            return x * power1(x, n - 1); // 재귀적으로 x의 n승을 계산
        }
    }
}
