package com.green.javaHome.sty.study_one.lambda_stream;

import javax.sound.midi.SysexMessage;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamEx2_3 {
    public static void main(String[] args) {
        Stream<String[]> strArrStrm = Stream.of(
                new String[]{"abc", "def", "jkl"},
                new String[]{"ABC", "DEF", "JKL"}
        );
        Stream<String> strStrm = strArrStrm.flatMap(Arrays::stream);

        strStrm.map(String::toLowerCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);
        System.out.println();

        String[] lineArr = {
                "believe or not It is true",
                "Do or do not There is no try",
        };
        Stream<String> lineStream = Arrays.stream(lineArr);

        lineStream.flatMap(line -> Stream.of(line.split(" +")))
                .map(String::toLowerCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);
        System.out.println();


        Stream<String> strStrm1 = Stream.of("AAA", "ABC", "bBb", "Dd");
        Stream<String> strStrm2 = Stream.of("bbb", "aaa", "ccc", "dd");


        Stream<Stream<String>> strStrmStrm = Stream.of(strStrm1, strStrm2);
        Stream<String> strStream = strStrmStrm
                .map(s -> s.toArray(String[]::new))
                .flatMap(Arrays::stream);
        strStream.map(String::toLowerCase)
                .distinct()
                .forEach(System.out::println);


    }
}
