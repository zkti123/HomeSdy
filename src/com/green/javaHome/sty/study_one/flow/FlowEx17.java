package com.green.javaHome.sty.study_one.flow;

import java.util.Scanner;

public class FlowEx17 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';

        System.out.print("점수를 입력하세요.>");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();

        ScoreObj so = new ScoreObj();
        grade = so.getGrade(score);


        System.out.printf("%d 점의 학점은 %c입니다.\n",score,grade);//출력은 마지막


    }
}
class ScoreObj{
    char getGrade(int score){
        char grade = ' ';
        if (score >=90){
            return  'A';
        }else if(score>=80){
            return  'B';
        }else if(score>=70){
            return  'C';
        }
        return  'D';
    }
}