package com.green.javaHome.sty.study_one.programming_language.construtor;

public class ConstrutorEx {
    public static void main(String[] args) {

        Data1 d1 = new Data1();
//        Data2 d2 = new Data2(); compile error 발생

    }
}

class Data1 {
    int value;
}
class Data2{
    int value;

    Data2(int x) {
        value = x;
    }
}
