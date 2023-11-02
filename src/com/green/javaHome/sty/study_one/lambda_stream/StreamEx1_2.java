package com.green.javaHome.sty.study_one.lambda_stream;

import java.util.Random;
import java.util.stream.IntStream;

public class StreamEx1_2 {
    public static void main(String[] args) {
//        IntStream intStream = new Random().ints();
        IntStream intStream = new Random().ints(5);
//        intStream.limit(5).forEach(System.out::println);
        intStream.forEach(System.out::println);
    }
}
