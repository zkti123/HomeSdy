package com.green.javaHome.sty.study_one.process_thread;

import javax.swing.*;

public class ThreadEx7 {
    public static void main(String[] args) { // 멀티 쓰레드
        Thread7_1 th1 = new Thread7_1();
        th1.start();

        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요");
        System.out.println("입력하신 값은 " + input+ "입니다.");
    }
}

class Thread7_1 extends Thread {
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                sleep(1000);
            } catch (Exception e) {

            }
        }
    }
}