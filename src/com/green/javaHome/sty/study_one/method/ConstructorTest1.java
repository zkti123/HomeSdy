package com.green.javaHome.sty.study_one.method;

public class ConstructorTest1 {
    public static void main(String[] args) {

        Data1 d1 = new Data1();
        //Data7 d7 = new Data7();  에러 << Data1 에는
        // 정의 되어 있는 생성자가 하나도 없어 기본 생성자를 추가해주었지만,
        // Data7 에는 Data7(int x)가 정의 되어있어 기본 생성자가 추가 되지 않았기 때문이다.
        // 컴파일러가 자동적으로 기본 생성자를 추가해주는 경우는 '클래스 내에 생성자가 하나도 없을 때' 뿐이다.

        Data7 d7 = new Data7(10); // << OK

    }

}



class Data1{
    int value;
    Data1(){}  // << 기본 생성자.

}
class Data7{
    int value;

    Data7(int x){   // << 매개 변수가 있는 생성자.
        value = x;
    }
}

