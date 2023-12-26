package com.green.javaHome.sty.study_one.method;

public class PramsTest {
    public static void main(String[] args) {
        int num = 10;
        changeNum(num);
        System.out.println(num);

        NumberBox nb = new NumberBox();
        nb.num = 10;
        changeNum2(nb);
        System.out.println(nb.num);
    }
    static void changeNum(int num){
        num = 20;
    }
    static void changeNum2(NumberBox nb2){
        nb2.num = 20;
    }
}


class NumberBox{
    int num;
}

