package com.green.javaHome.sty.study_one.lambda_stream;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class StreamEx2_8 {
    public static void main(String[] args) {
        Student5[] stuArr = {
                new Student5("나자바", true, 1, 1, 300),
                new Student5("김지미", false, 1, 1, 250),
                new Student5("김자바", true, 1, 1, 200),
                new Student5("이지미", false, 1, 2, 150),
                new Student5("남자바", true, 1, 2, 100),
                new Student5("안지미", false, 1, 2, 50),
                new Student5("황지미", false, 1, 3, 100),
                new Student5("강지미", false, 1, 3, 150),
                new Student5("이자바", true, 1, 3, 200),

                new Student5("나자바", true, 2, 1, 300),
                new Student5("김지미", false, 2, 1, 250),
                new Student5("김자바", true, 2, 1, 200),
                new Student5("이지미", false, 2, 2, 150),
                new Student5("남자바", true, 2, 2, 100),
                new Student5("안지미", false, 2, 2, 50),
                new Student5("황지미", false, 2, 3, 100),
                new Student5("강지미", false, 2, 3, 150),
                new Student5("이자바", true, 2, 3, 200)
        };
        System.out.printf("1. 단순 그룹화(반별로 그룹화)\n");
        Map<Integer, List<Student5>> stuBan = Stream.of(stuArr).collect(groupingBy(Student5::getBan));

        for (List<Student5> ban : stuBan.values()) {
            for (Student5 s : ban) {
                System.out.println(s);
            }
        }
        System.out.printf("%n2. 단순그룹화(성적별로 그룹화)\n");
        Map<Student5.Level,List<Student5>> stuByLevel = Stream.of(stuArr).collect(groupingBy(s->{
            if (s.getScore() >= 200) {
                return Student5.Level.HIGH;
            }
            if (s.getScore() >= 100) {
                return Student5.Level.MID;
            } else {
                return Student5.Level.LOW;
            }
        }));

        TreeSet<Student5.Level> keySet = new TreeSet<>(stuByLevel.keySet());

        for (Student5.Level key : keySet) {
            System.out.println("[" + key + "]");


            for (Student5 s : stuByLevel.get(key)) {
                System.out.println(s);
                System.out.println();
            }
        }
        System.out.printf("%n3. 단순그룹화+통계(성적별 학생수)\n");
        Map<Student5.Level, Long> stuCntByLevel = Stream.of(stuArr).collect(groupingBy(s -> {
            if (s.getScore() >= 200) {
                return Student5.Level.HIGH;
            }
            if (s.getScore() >= 100) {
                return Student5.Level.MID;
            } else {
                return Student5.Level.LOW;
            }

        }, counting()));

    }
}

class Student5 {
    String name;
    boolean isMale;
    int hak;
    int ban;
    int score;

    public Student5(String name, boolean isMale, int hak, int ban, int score) {
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

    enum Level {
        HIGH,MID,LOW
    }

}
