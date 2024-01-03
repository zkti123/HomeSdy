package com.green.javaHome.sty.study_one.abstract1;

public abstract class AbstractEx1 {

    int multi(int n1 , int n2){return n1*n2;}


    abstract void sum(int n1, int n2);

}

class ChildClass extends AbstractEx1{

    @Override
    void sum(int n1, int n2) {
        System.out.println("합계 : "+(n1+n2));
    }
}
class Cild2Class extends AbstractEx1{

    @Override
    void sum(int n1, int n2) {
        System.out.println("sum : "+(n1+n2));

    }
}
