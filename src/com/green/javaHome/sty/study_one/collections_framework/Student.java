package com.green.javaHome.sty.study_one.collections_framework;

import java.util.ArrayList;
import java.util.List;

public class Student {
    int name;
    int score;

    public Student(int name, int score) {
        this.name = name;
        this.score = score;
    }

    public int getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}

class StudentCore {
    public List<Student> list(List<Student> studentscore) {
        List<Student> list1 = new ArrayList<>();
        for (Student student : studentscore) {
            if (student.getScore() < 80) {
                list1.add(student);
            }
        }
        return list1;
    }
}
