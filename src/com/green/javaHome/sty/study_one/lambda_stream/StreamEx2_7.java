package com.green.javaHome.sty.study_one.lambda_stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx2_7 {
    public static void main(String[] args) {
        Student4[] stuArr = {
                new Student4("나자바", true, 1, 1, 300),
                new Student4("김지미", false, 1, 1, 250),
                new Student4("김자바", true, 1, 1, 200),
                new Student4("이지미", false, 1, 2, 150),
                new Student4("남자바", true, 1, 2, 100),
                new Student4("안지미", false, 1, 2, 50),
                new Student4("황지미", false, 1, 3, 100),
                new Student4("강지미", false, 1, 3, 150),
                new Student4("이자바", true, 1, 3, 200),

                new Student4("나자바", true, 2, 1, 300),
                new Student4("김지미", false, 2, 1, 250),
                new Student4("김자바", true, 2, 1, 200),
                new Student4("이지미", false, 2, 2, 150),
                new Student4("남자바", true, 2, 2, 100),
                new Student4("안지미", false, 2, 2, 50),
                new Student4("황지미", false, 2, 3, 100),
                new Student4("강지미", false, 2, 3, 150),
                new Student4("이자바", true, 2, 3, 200)
        };
        System.out.printf("1. 단순분할(성별로 분할)\n");
        Map<Boolean, List<Student4>> stuBysex = Stream.of(stuArr).collect(Collectors.partitioningBy(Student4::isMale));

        List<Student4> maleStudent = stuBysex.get(true);
        List<Student4> femaleStudent = stuBysex.get(false);
        for (Student4 s : maleStudent) {
            System.out.println(s);
        }
        for (Student4 s : femaleStudent) {
            System.out.println(s);
        }
        System.out.printf("%n2. 단순분할 + 통계(성별 학생수)\n");

        Map<Boolean, Long> stuNumBySex = Stream.of(stuArr).collect(Collectors.partitioningBy(Student4::isMale, Collectors.counting()));
        System.out.println("남학생수 : " + stuNumBySex.get(true));
        System.out.println("여학생수 : " + stuNumBySex.get(false));

        System.out.printf("%n3. 단순분할+통계(성별 1등)\n");
        Map<Boolean, Optional<Student4>> topScoreBySex = Stream.of(stuArr).collect(Collectors.partitioningBy(Student4::isMale,
                Collectors.maxBy(Comparator.comparingInt(Student4::getScore))));
        System.out.println("남학생 1등 : "+topScoreBySex.get(true));
        System.out.println("여학생 1등 : "+topScoreBySex.get(false));

        Map<Boolean, Student4> topScoreBySex2 = Stream.of(stuArr).collect(Collectors.partitioningBy(Student4::isMale
                , Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Student4::getScore)), Optional::get)));

        System.out.println("남학생 1등 : "+topScoreBySex2.get(true));
        System.out.println("여학생 1등 : "+topScoreBySex2.get(false));

        System.out.printf("%n4. 다중분할(성별 불합격자, 100점이하)\n");

        Map<Boolean, Map<Boolean, List<Student4>>> failedStuBySex = Stream.of(stuArr).collect(Collectors.partitioningBy(Student4::isMale
                , Collectors.partitioningBy(s -> s.getScore() <= 100)));

        List<Student4> failedMaleStu = failedStuBySex.get(true).get(true);
        List<Student4> failedFemaleStu = failedStuBySex.get(false).get(true);

        for (Student4 s : failedMaleStu) {
            System.out.println(s);
        }
        for (Student4 s : failedFemaleStu) {
            System.out.println(s);
        }
    }
}
class Student4{
    String name;
    boolean isMale;
    int hak;
    int ban;
    int score;

    public Student4(String name, boolean isMale, int hak, int ban, int score) {
        this.name = name;
        this.isMale = isMale;
        this.hak = hak;
        this.ban = ban;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public boolean isMale() {
        return isMale;
    }

    public int getHak() {
        return hak;
    }

    public int getBan() {
        return ban;
    }

    public int getScore() {
        return score;
    }
    public String toString() {
        return String.format("[%s,%s,%d학년,%d반,%3d점]",name,isMale ? "남":"여",hak,ban,score);
    }

}