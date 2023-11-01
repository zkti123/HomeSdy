package com.green.javaHome.sty.study_one.process_thread;

public class ThreadEx12 {
    static  long startTime = 0;
    public static void main(String[] args) {
        ThreadEx12_1 th1 = new ThreadEx12_1();
        ThreadEx12_2 th2 = new ThreadEx12_2();

        th1.start();
        th2.start();
        startTime = System.currentTimeMillis();

        try {
            th1.join();
            th2.join();
        } catch (InterruptedException e) {

        }
        System.out.print("소요 시간 : " + (System.currentTimeMillis()-ThreadEx12.startTime));

    }
}

class ThreadEx12_1 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print(new String("-"));

        }
    }
}

class ThreadEx12_2 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print(new String("|"));

        }
    }
}

