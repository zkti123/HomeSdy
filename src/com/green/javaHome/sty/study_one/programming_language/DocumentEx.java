package com.green.javaHome.sty.study_one.programming_language;

public class DocumentEx {
    public static void main(String[] args) {
        Document d1 = new Document();
        Document d2 = new Document("자바 text");
        Document d3 = new Document();
        Document d4 = new Document();
        d1.name = "초코";
        System.out.println(d1.name);
    }
}
class Document{

    static int count = 0;
    String name;

    Document() {
        this("제목 없음" + ++count);
    }

    Document(String name) {
        this.name = name;
        System.out.println("문서" + this.name + "가 생성되었습니다.");
    }
}
