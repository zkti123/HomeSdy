package com.green.javaHome.sty.study_one;

import java.util.List;

public class Test22 {
    public static void main(String[] args) {
        List<String> fruits = List.of("포도","자두","고구마","사과");
        String result = check(fruits);
        System.out.println("결과 : " + result);

    }
    public static String check(List<String> fruits){
        for (String fruit : fruits){
            if (fruit.contains("사과")){
                return "과일";
            }
        }
        return "not fruit";
    }
}
