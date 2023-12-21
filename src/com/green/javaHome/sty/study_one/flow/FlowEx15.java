package com.green.javaHome.sty.study_one.flow;

import java.util.Scanner;

public class FlowEx15 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num = 0;


        while(true){
            System.out.print("(1)squre\n"+"(2)squre root\n"+"(3)log\n");
            System.out.print("원하는 메뉴(1~3)를 선택하세요 (종료:0)");
            String tmp = scanner.nextLine();
            num = Integer.parseInt(tmp);

            //int tmp = scanner.nextInt(); <=두 줄 만 사용할경우 실무에서 사용안함

            if (num>=1&&num<4){
                System.out.println("선택하신 메뉴는 "+num+"입니다.\n");

            }else if (num == 0){
                System.out.println("프로그램을 종료합니다.");
                break;
            }else if (!(num>=1&&num<4)){
                System.out.println("메뉴를 잘못 선택하셨습니다.(종료:0)");
            }
        }


    }
}
