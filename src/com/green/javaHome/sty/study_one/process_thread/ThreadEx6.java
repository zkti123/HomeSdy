package com.green.javaHome.sty.study_one.process_thread;

import javax.swing.*;

public class ThreadEx6 {  // 싱글 쓰레드
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("아무값이나 입력하세요");
        System.out.println("입력하신 값은 " + input + "입니다.");

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);

            } catch (Exception e) {

            }
        }
    }
}
