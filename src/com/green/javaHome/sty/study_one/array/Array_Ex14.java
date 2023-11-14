package com.green.javaHome.sty.study_one.array;

public class Array_Ex14 {
    public static void main(String[] args) {
        String[] titles = { "국어", "영어", "수학", "사회", "도덕" };
        int[] titleSumArr = new int[titles.length];
        int[][] score = {
                { 100, 90, 80, 10, 12 }
                , {  20, 20, 20, 20, 13 }
                , {  30, 30, 30, 30, 14 }
                , {  40, 40, 40, 40, 15 }
        };
        System.out.print("번호\t");
        for (int i = 0; i < titles.length; i++) {
            System.out.printf("%s\t", titles[i]);
        }
        System.out.println("총점/평균");
        System.out.println("====================");
        for (int i = 0; i < score.length; i++) {
            int[] eachScore = score[i];
            int sum = 0;
            System.out.printf("%3d\t", i + 1);  // 번호 1234
            for (int j = 0; j < eachScore.length; j++) {
                int jumsu = eachScore[i];
                System.out.printf("%3d\t", jumsu);   // 각 과목 점수
                sum += jumsu;
                titleSumArr[j] += jumsu;
            }
            System.out.printf("%3d\t %4.1f\n", sum, ((double) sum / eachScore.length)); //총점점수,평균

        }
        System.out.println("================");
        System.out.println("총점");
        for (int i = 0; i < titles.length; i++) {
            System.out.printf("%s : %d\n", titles[i], titleSumArr[i]);
        }
    }
}