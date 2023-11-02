package com.green.javaHome.sty.study_one.lambda_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx1_1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> intStream = list.stream();  // list를  Stream으로 변환

        //stream은1회용. stream에 대해 최종연산을 수행하면 stream이 닫힌다.
        intStream.forEach(System.out::println);
        intStream = list.stream(); // list로 부터 stream을 생성
        System.out.println("===========");
        intStream.forEach(System.out::println);

        System.out.println("===========");
        String[] strArr = {"a", "b", "c", "d"};
   //     Stream<String> strStream = Stream.of(strArr);
        Stream<String> strStream = Arrays.stream(strArr);
        strStream.forEach(System.out::println);

        System.out.println("===========");
        int[] intArr1 = {1, 2, 3, 4, 5};
        IntStream intStream1 = Arrays.stream(intArr1);
//        intStream1.forEach(System.out::println);
//        System.out.println("count = " + intStream1.count());
//        System.out.println("sum  = " + intStream1.sum());
//        System.out.println("average = " + intStream1.average());

//        System.out.println("===========");
//        Integer[] intArr1 = {1, 2, 3, 4, 5};
//        Stream<Integer> intStream2 = Arrays.stream(intArr1);
//        intStream2.forEach(System.out::println);
//        System.out.println("count = " + intStream2.count());
    }
}
