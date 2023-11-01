package com.green.javaHome.sty.study_one.process_thread;

import javax.swing.*;

public class ThreadEx10 {
    public static void main(String[] args) {
        ThreadEx10_1 th1 = new ThreadEx10_1();
        th1.start();
        System.out.println("usInterrupted() : " + th1.isInterrupted());
        String input = JOptionPane.showInputDialog("아무값이나 입력하세요");
        System.out.println("입력하신 값음 " + input + "입니다.");
        th1.interrupt(); // interrupt 를 호출하면 , interrupted상태가 true가 된다.
        System.out.println("isInterrupted : " + th1.isInterrupted());
        System.out.println("isInterrupted : " + th1.isInterrupted());

    }
}

class ThreadEx10_1 extends Thread {
    public void run() {
        int i = 10;

        while (i != 0 && !isInterrupted()) {
            System.out.println(i--);
            for (long j = 0; j <2500000000L ; j++) {

            }

        }
        System.out.println("카운트가 종료되었습니다.");
    }
}