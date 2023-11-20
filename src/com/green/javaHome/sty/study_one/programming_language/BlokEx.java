package com.green.javaHome.sty.study_one.programming_language;

public class BlokEx {
    static{
        System.out.println("static { }"); // 클래스 초기화 블럭
    }
    {
        System.out.println("{ }"); //인스턴스 초기화 블럭
    }

    public BlokEx() {
        System.out.println("생성자");
    }

    public static void main(String[] args) {
        System.out.println("BlockEx bt = new BlockEx();");
        BlokEx bt = new BlokEx();

        System.out.println("BlockEx bt2 = new BlockEx();");
        BlokEx bt2 = new BlokEx();
    }
}
