package com.green.javaHome.sty.study_one.process_thread;

public class ThreadEx13 {
    public static void main(String[] args) {
        Runnable r = new RunnableEx13();
        new Thread(r).start(); //ThreadGroup에 의해 참조되므로 gc대상이 아니다.
        new Thread(r).start(); //ThreadGroup에 의해 참조되므로 gc대상이 아니다.
    }
}

class Account{
    private int balance = 1000; //private 으로 해야 동기화가 의미가 있다.

    public int getBalance() {
        return balance;
    }

    public synchronized void withDraw(int money) {  //synchronized 로 메서드를 동기화
        if (balance >= money) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
            balance -= money;
        }
    }
}

class RunnableEx13 implements Runnable {
    Account acc = new Account();

    public void run() {
        while (acc.getBalance() > 0) {
            // 100 , 200, 300 중의 한 값을 임의로 선택해서 출금 (withdraw)
            int money = (int)(Math.random() *3 +1)*100;
            acc.withDraw(money);
            System.out.println("balance : " + acc.getBalance());

        }
    }
}