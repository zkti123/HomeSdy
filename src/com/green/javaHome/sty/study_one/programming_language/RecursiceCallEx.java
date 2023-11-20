package com.green.javaHome.sty.study_one.programming_language;

public class RecursiceCallEx {
    public static void main(String[] args) {
        int restut = factorial(4);

        System.out.println(restut);
    }

    static int factorial(int n) {
        int result = 0;
        if (n == 1) {
            result = 1;
        } else {
            result = n * factorial(n - 1);
            // 예를 들어, factorial(4)를 계산하는 경우:
            // factorial(4) = 4 * factorial(3)
            // factorial(3) = 3 * factorial(2)
            // factorial(2) = 2 * factorial(1)
            // factorial(1) = 1 (base case, 재귀 호출 종료 조건)
            // 따라서 factorial(4) = 4 * 3 * 2 * 1 = 24 가 됩니다.
        }
        return result;
    }
}
