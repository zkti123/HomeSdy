package com.green.javaHome.sty.study_one.lambda_stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class StreamEx2_6 {
    public static void main(String[] args) {
        Student3[] stuArr = {
                new Student3("이자바", 3, 300),
                new Student3("김자바", 1, 200),
                new Student3("안자바", 2, 100),
                new Student3("박자바", 2, 150),
                new Student3("소자바", 1, 200),
                new Student3("나자바", 3, 290),
                new Student3("감자바", 3, 180)
        };
        // List<String>에 학생들의 이름을 수집하는 예시
        List<String> names = Stream.of(stuArr).map(Student3::getName).collect(Collectors.toList());
        System.out.println(names);

        // Student3 객체 배열을 다른 배열로 변환하는 예시
        Student3[] stuArr2 = Stream.of(stuArr).toArray(Student3[]::new);

        for (Student3 s : stuArr2) {
            System.out.println(s);
        }
        // 학생 이름을 키로 하고 Student3 객체를 값으로 갖는 Map을 생성하는 예시
        Map<String, Student3> stuMap = Stream.of(stuArr).collect(Collectors.toMap(s -> s.getName(), p -> p));
        for (String name : stuMap.keySet()) {
            System.out.println(name + "-" + stuMap.get(name));
        }
        // 요소 수(counting), 총 점수 합(summingInt), 합계(reducing) 등 다양한 연산을 수행하는 예시
        long count = Stream.of(stuArr).collect(counting());
        long totalScore = Stream.of(stuArr).collect(summingInt(Student3::getTotalScore));
        System.out.println("count" + count);
        System.out.println("totalScore" + totalScore);

        totalScore = Stream.of(stuArr).collect(reducing(0, Student3::getTotalScore, Integer::sum));
        System.out.println("totalScore = " + totalScore);

        // 최댓값(maxBy) 및 요약 통계(summarizingInt)를 계산하는 예시
        Optional<Student3> topStudent = Stream.of(stuArr).collect(maxBy(Comparator.comparingInt(Student3::getTotalScore)));
        System.out.println("topStudent = " + topStudent.get());

        IntSummaryStatistics stat = Stream.of(stuArr).collect(summarizingInt(Student3::getTotalScore));
        System.out.println(stat);

        // 학생 이름을 구분자로 연결(joining)하여 하나의 문자열로 만드는 예시
        String stuNames = Stream.of(stuArr).map(Student3::getName).collect(joining(",", "{", "}"));
        System.out.println(stuNames);
    }
}

class Student3 implements Comparable<Student> {
    String name;
    int ban;
    int totalScore;

    public int compareTo(Student students) {
        return students.totalScore - this.totalScore;
    }
    public Student3(String name, int ban, int totalScore) {
        this.name = name;
        this.ban = ban;
        this.totalScore = totalScore;
    }

    public String getName() {
        return name;
    }

    public int getBan() {
        return ban;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public String toString() {
        return String.format("[%s,%d,%d]", name, ban, totalScore).toString();

    }

}

/*counting():
스트림의 요소 수를 세어 그 수를 반환합니다.

summingInt():
지정된 키(필드 또는 함수)를 기반으로 요소의 숫자 값을 합산합니다.

reducing():
여러 값들을 조합하여 하나의 값으로 축소하는 데 사용됩니다.

maxBy():
지정된 Comparator에 따라 최댓값을 찾아 반환합니다.

summarizingInt():
요소들의 요약 통계(최댓값, 최솟값, 합계, 평균 등)를 계산합니다.

joining():
문자열 요소를 하나의 문자열로 연결합니다.
*/