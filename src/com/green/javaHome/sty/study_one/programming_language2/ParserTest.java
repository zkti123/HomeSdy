package com.green.javaHome.sty.study_one.programming_language2;

public class ParserTest {
    public static void main(String[] args) {
        Parseable parseable = ParserMannager.getPaser("XML");
        parseable.parse("document.xml");
        parseable = ParserMannager.getPaser("HTML");
        parseable.parse("document2.html");
    }
}

interface Parseable {
    public abstract void parse(String fileName);
}

class XMLParser implements Parseable {
    public void parse(String fileName) {
        System.out.println(fileName+"- XML parsing completed");
    }
}

class HTMLParser implements Parseable {
    @Override
    public void parse(String fileName) {
        System.out.println(fileName + "- HTML parsing completed");
    }
}

class ParserMannager {
    public static Parseable getPaser(String type) {
        if (type.equals("XML")) {
            return new XMLParser();
        }else {
            Parseable p = new HTMLParser();
            return p;
        }
    }
}



