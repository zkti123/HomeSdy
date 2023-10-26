package com.green.javaHome.sty.study_one.collections_framework;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import static jdk.jshell.Snippet.Kind.EXPRESSION;

public class Ex11_Stack_QueueEx1 {
    public static void main(String[] args) {
//        if (args.length != 1) {
//            System.out.println("Usage:java ExpValidCheck\"EXPRESSION\"");
//            System.out.println("Example : java ExpValidCheck \"((2+3)*1)+3\"");
//            System.exit(0);
//        }
        Stack st = new Stack<>();
//        String expression = args[0];
        String expression = "((3+5)*8)";

        System.out.println("expression : " + expression);

        try {
            for (int i = 0; i < expression.length(); i++) {
                char ch = expression.charAt(i);
                if (ch == '(') {
                    st.push(ch + "");
                } else if (ch == ')') {
                    st.pop();
                }
            }
            if (st.isEmpty()) {
                System.out.println("괄호가 일치합니다.");

            } else {
                System.out.println("괄호가 일치하기 않습니다.");

            }
        } catch (EmptyStackException e) {
            System.out.println("괄호가 일치하지 않습니다.");
        }




    }
}
