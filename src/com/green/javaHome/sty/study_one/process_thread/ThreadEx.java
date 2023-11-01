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



           sleep()
         - 현재 쓰레드를 지정된 시간동안 멈추게 한다 자기자신만 가능. static 메서드. 천분의일초 1000 = 1초
         - 예외처리를 해야한다 (InterruptedException이 발생하면 깨어남)
         - 특정 쓰레드를 지정해서 멈추게 하는 것은 불가능하다. 자기자신만 가능.

        interrupt()
        - 대기상태(WAITING)인 쓰레드를 샐행대기 상태(RUNNERBLE)로 만든다.
        - static boolean interrupted() 현재 쓰레드의 interrupted상태를 알려주고, false로 초기화

        suspend() = 일시정지  resume() = 재개  <<==  자바 12버전 위부터 지원 안함


         -suspend()에 의해 일시정지된 쓰레드를 실험대기상태로 만든다.
        stop() = 완전정지

         join()
         -지정된 시간동안 특정 쓰레드가 작업하는 것을 기다린다

        쓰레드의 동기화(synchronization)
        -멀티 쓰레드 프로세스에서는 다른 쓰레드의 작업에 영향을 미칠 수 있다.
        -진행중인 작업이 다른 쓰레드에게 간섭받지 않게 하려면 '동기화'가 필요
        -->>>쓰레드의 동기화 - 한 쓰레드가 진행중인 작업을 다른 쓰렏가 간섭하지 못하게 막는것
        -동기화 하려면 간섭받지 않아야 하는 문장들을  '임계 영역({})'으로 설정
        -임계영역은 락(lock)을 얻은 단 하나의 쓰레드만 출입가능(객체1개에 락1개) 자바에서는 객체 한개마다 락한개.

        synchronization 를 이용한 동기화
        -synchronization 임계영역(lock이 걸리는 영역)을 설정 하는 방법 2가지
        1.메서드 전체를 임계영역으로 지정
            EX)) public synchronization void calcSum(){}
        2.특정한 영역을 임계 영역으로 지정
        synchronization(객체 참조 변수){}

        wait()과 notify()
        -동기화의 효율을 높이기 위해 wait()-기다리기, notify()-통보,알려주기 를 사용.
        -Object클래스에 정의되어 있이며, 동기화 블록 내에서만 사용할 수 있다.

         wait()
         - 객체의 lock을 풀고 쓰레드를 해당 객체의 waiting pool에 넣는다. (waiting pool = 대기열)
         notify()
         - waiting pool에서 대기중인 쓰레드 중의 하나를 꺠운다.
         notifyAll()
         - waiting pool에서 대기중인 모든 쓰레드를 깨운다.



         */
    }
}
