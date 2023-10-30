package com.green.javaHome.sty.study_one.process_thread;

public class ThreadEx {
    public static void main(String[] args) {
        /*
             1.  Thread 의 상속  <== 자바는 단일 상속 2번이 낮다.
               class myThread extends Thread{
               public void run(){ 작업 내용}   <==Thread 클래스의 run()을 오버 라이딩
               }

             2. Runnable 인터페이스를 구현
                class myThread implements Runnable{
                  public void run(){ 작업 내용}   <==Runnable 인터페이스의 run()을 구현
               }



          -쓰레드를 생성한 후에 stat()를 호출해야 쓰레드가 작업을 시작한다.
            실행순서는 꼭 앞에 있다고 먼저 실행 되진 않는다 os스케쥴러가 실행순서 결정.


           -쓰레드의 I/O블락킹(blocking) input / output  입력/출력 = 입출력    블락킹 <= 입출력시 작업중단
         */
    }
}
