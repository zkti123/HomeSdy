package com.green.javaHome.sty.study_one.collections_framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorEx2 {
    public static void main(String[] args) {
        ArrayList original = new ArrayList<>();
        ArrayList copy1 = new ArrayList<>();
        ArrayList copy2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            original.add(i + "");
        }
        Iterator it = original.iterator();
        while (it.hasNext()) {
            copy1.add(it.next());
        }
        System.out.println("== Original에서 copy1로 복사(copy)===");
        System.out.println("Original : " + original);
        System.out.println("copy1 : " + copy1);
        System.out.println();

        it = original.iterator();
        while (it.hasNext()) {
            copy2.add(it.next());
            it.remove();
        }
        System.out.println("== Original에서 copy2로 이동(move)===");
        System.out.println("Original : " + original);
        System.out.println("copy2 : " + copy2);
    }
}
