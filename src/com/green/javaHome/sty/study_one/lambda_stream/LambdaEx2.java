package com.green.javaHome.sty.study_one.lambda_stream;

@FunctionalInterface
interface MyFunction1 {
    void myMethod();
}

public class LambdaEx2 {
    public static void main(String[] args) {
        MyFunction1 f = ()->{};
        Object obj = (MyFunction1)(()->{});
        String str =((Object)(MyFunction1)(()->{})).toString();

        System.out.println(f);
        System.out.println(obj);
        System.out.println(str);
        System.out.println((MyFunction1)(()->{}));
        System.out.println(((Object)(MyFunction1)(()->{})).toString());
    }
}
