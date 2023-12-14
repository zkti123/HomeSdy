package com.green.javaHome.sty.study_one.variable;

public class VariableString2 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "hello";

        System.out.println(s1 == s2);

        String s3 = new String("hello");
        String s4 = new String("hello");

        System.out.println("s3 : " + s3);
        System.out.println("s4 : " + s4);
        System.out.println("s3==s4: "+ (s3 == s4));
        System.out.println("s3.equals(s4): "+ s3.equals(s4));
    }
}
