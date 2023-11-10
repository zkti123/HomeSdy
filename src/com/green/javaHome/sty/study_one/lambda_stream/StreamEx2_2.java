package com.green.javaHome.sty.study_one.lambda_stream;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx2_2 {
    public static void main(String[] args) {
        Student[] stuArr = {
                new Student("이자바", 3, 300),
                new Student("김자바", 1, 200),
                new Student("안자바", 2, 100),
                new Student("박자바", 2, 150),
                new Student("서자바", 1, 200),
                new Student("나자바", 3, 290),
                new Student("감자바", 3, 180),
        };

        Stream<Student> stuStream = Stream.of(stuArr);

        stuStream.sorted(Comparator.comparing(Student::getBan)
                        .thenComparing(Comparator.naturalOrder()))
                .forEach(System.out::println);

        stuStream = Stream.of(stuArr);
        IntStream stuScoreStream = stuStream.mapToInt(Student::getTotalScore);
        IntSummaryStatistics stat = stuScoreStream.summaryStatistics();

        System.out.println("count = " + stat.getCount());
        System.out.println("sum = " + stat.getSum());
        System.out.printf("average = %.2f%n", stat.getAverage());
        System.out.println("min = " + stat.getMin());
        System.out.println("max=" + stat.getMax());
    }
}

class Student1 implements Comparable<Student> {
    String name;
    int ban;
    int totalScore;

    public Student1(String name, int ban, int totalScore) {
        this.name = name;
        this.ban = ban;
        this.totalScore = totalScore;
    }

    public String toString(){
        return String.format("[%s,%d,%d]", name, ban, totalScore).toString();
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

    public int compareTo(Student student) {
        return student.totalScore - this.totalScore;
    }
}