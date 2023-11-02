package com.green.javaHome.sty.study_one.lambda_stream;

import java.util.function.Function;
import java.util.function.Supplier;

public class LambdaEx8 {
    public static void main(String[] args) {
        //Function<String , Integer> f = (String s) -> Integer.parseInt(s);
        //Function<String , Integer> f = 클래스이름::메서드이름;
        Function<String , Integer> f = Integer::parseInt;
        //Function<String , Integer> f = (String s) -> Integer.parseInt(s); // 람다식
        System.out.println(f.apply("100") + 200);

        //Supplier 입력X, 출력0
//        Supplier<MyClass> s = () -> new MyClass();
        Supplier<MyClass> s = MyClass::new;

         MyClass mc = s.get();
        System.out.println(mc);
        System.out.println(s.get());

//        Function<Integer, MyClass1> f1 = (i) -> new MyClass1(i);
        Function<Integer, MyClass1> f1 = MyClass1::new;

        MyClass1 mc1 = f1.apply(100);
        System.out.println(mc1.iv);

        System.out.println(f1.apply(200).iv);

       // Function<Integer, int[]> f2 = (i) -> new int[i];
        Function<Integer, int[]> f2 = int[]::new;

        int[] arr = f2.apply(100);
        System.out.println("arr.length = "+ arr.length);
    }
}

class MyClass {

}

class MyClass1 {
    int iv;

    public MyClass1(int iv) {
        this.iv = iv;
    }
}