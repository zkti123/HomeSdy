package com.green.javaHome.sty.study_one.collections_framework.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx1 {
    public static void main(String[] args) {
        HashMap map = new HashMap<>();
        map.put("myId", "1234");
        map.put("asdf", "1111");
        map.put("asdf", "1234");
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("id와 password를 입력해주세요.");
            System.out.println("id : ");
            String id = s.nextLine().trim();

            System.out.println("password :");
            String password = s.nextLine().trim();
            System.out.println();

            if (!map.containsKey(id)) {
                System.out.println("입력하신 id가 존재하지 않습니다." + "다시 입력해주세요");
                continue;
            }
            if (!(map.get(id).equals(password))) {
                System.out.println("비밀번호가 일치하지 않습니다. 다시입력해주세요");

            } else {
                System.out.println("id와 비밀번호가 일치 합니다.");
                break;
            }
        }
    }
}
