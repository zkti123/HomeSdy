package com.green.javaHome.sty.study_one.method;

public class ObjectPrint {
    public static void main(String[] args) {
        String str = new String("ABC");
        System.out.println(str);

        ValueBox vb = new ValueBox();
        vb.num = 10;
        System.out.println(vb);


    }
}
class ValueBox{

    int num;


}