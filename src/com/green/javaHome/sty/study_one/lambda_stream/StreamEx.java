package com.green.javaHome.sty.study_one.lambda_stream;

public class StreamEx {
    public static void main(String[] args) {
        /*
         스트림
         -다양한 데이터 소스를 표준화 된 방볍으로 다루기 위한 것

         스트림이 제공하는 기능
         -중간 연산과 최종연산
         중간연산 - 연산결과가 스트림인 연산. 반복적으로 적용가능
         최종연산 - 연산결과가 스트림이 아닌 연산. 단 한번만 적용가능(스트림의 요소를 소모)
         EX))) steam.distinct().limit(5).sorted().forEach(System.out::println)
                       중간연산     중간연산   중간연산         최종연산 출력.

            스트림 특징
            - 스트림은 데이터 소스로부터 데이터를 읽기만 할 뿐 변경하지 않는다. 원본변경X
            - 스트림은 Iterator처럼 일회용이다.(필요하면 다시 스트림을 생성해야함)
            - 최종 연산 전까지 중간연산이 수행되지않는다. - 지연된연산
            - 스트림은 작업을 내부 반복으로 처리한다.
            - 코드가 간결해진다
            - 스트림의 작업을 병력로 처리  - 병렬 스트림
            - 기본형스트림 -> IntStream, LongStream, DoubleStream
                - 오토박싱& 언박싱의 비효율이 제거됨(Stream<Integer>대신 IntStream사용)
                - 숫자와 관련된 유용한 메서드를 Stream<T>보다 더 많이 제공


            스트림 만들기 -컬렉션
            - Collection 인터페이스의 stream()으로 컬렉션을 스트림으로 변환
                =>> Stream<E> stream()  // Collection인터페이스의 메서드
            스트림 만들기 -배열
            -객체 배열로부터 스트림 생성하기
            EX)) Stream<T> stream.of(T... values) //가변인자
                 Stream<T> Stream.of(T[])
                 Stream<T> Arrays.stream(T[])
                 Stream<T> Arrays.stream(T[] array , int startInclusive, int endExclusive)
                ->>>>
              Stream<String> strStream = Stream<T> stream.of("a","b","c"); 가변인자
              Stream<String> strStream = Stream<T> stream.of(new String[]{"a","b","c"});
              Stream<String> strStream = Arrays.steam(new Stringp[]{"a","b","c"});
              Stream<String> strStream = Arrays.steam(new Stringp[]{"a","b","c"},0,3);


            -기본형 배열로부터 스트림 생성하기
            EX)) IntStream IntStream.of(int...values)
                 IntStream IntStream.of(int[]])
                 IntStream Arrays.stream(int[])
                 IntStraem Arrays.stream(int[] array, int startInclusive, int endExclusive)


            - 임의의 수
               -난수를 요소로 갖는 스트림 생성하기
                EX)) IntStream intStream = new Random().ints(); 무한 스트림
                        intStream.limit(5).foreach(System.out::println);  5개의 요소만 출력한다.
                        intStream intStream = new Random().ints(5) 크기가 5인 난수 스트림을 반환
         */
    }
}
