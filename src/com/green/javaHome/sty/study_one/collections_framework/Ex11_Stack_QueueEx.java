package com.green.javaHome.sty.study_one.collections_framework;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex11_Stack_QueueEx {
    public static void main(String[] args) {
        Stack st = new Stack<>();
        Queue q = new LinkedList(); //  Queue의 인터페이스의 구현체인 LinkdList를 사용

        st.push("0");
        st.push("1");
        st.push("2");

        q.offer("0");
        q.offer("1");
        q.offer("2");


        System.out.println("======Stack========");
        while (!st.empty()) {
            System.out.println(st.pop());
        }

        System.out.println("========Queue========");
        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }
    }
}
