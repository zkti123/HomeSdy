package com.green.javaHome.sty.study_one.variable;

public class VariableFloat {
    public static void main(String[] args) {
        //double(8byte), float (4byte)
        float f1 = 10;
        System.out.println(f1);

        f1 = (float)9.66;
        f1 = 9.66f;
        f1 = 9.66f;
        System.out.println(f1);
        double d1 = 10.7777;
        System.out.println(d1);
        d1 = 10d;
        System.out.println(d1);

        long l1 = 100;
        float f3 = l1; //자동형변환
        System.out.println(f3);
    }
}
