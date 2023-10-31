package com.green.javaHome.sty.study_one.process_thread;

public class DaemonThread {
    public static void main(String[] args) {
        /*
        데몬 쓰레드
        -다른 일반 쓰레드의 작업을 돕는 보조적인 역할을 수행하는 쓰레드이다.
        -일반 쓰레드가 종료되면 데몬쓰레드는 강제적으로 자동으로 종료된다
        -무한루프와 조건문을 이용해서 실행 후 대기하고 있다가 특정 족건이 만족되면 작업을 수행하고 다시 대기하도록 작성한다
        -일반 쓰레드의 작성방법과 같응로 다만 쓰레드를 생성한 다음 실행하기전에 setDaemon(true)를 호출하기만하면 된다.
        -데몬 쓰레드가 생성한 쓰레드는 자동적으로 데몬 쓰레드가 된다.

        데몬 쓰레드 EX))) 가비지컬텍터, 워드프러세서의 자동저장, 화면자동갱신등

         */
    }
}
