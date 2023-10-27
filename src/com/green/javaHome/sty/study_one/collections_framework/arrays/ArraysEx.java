package com.green.javaHome.sty.study_one.collections_framework.arrays;

public class ArraysEx {
    public static void main(String[] args) {
        /*
        1.배열의 출력 - toString()
        2.배열의 복사 - copOf(),copyOfRange()
        3.배열 채우기 - fill(),setAll()

        Ex)) int[] arr = new int[5];
            Arrays.fill(arr,9);             arr= [9,9,9,9,9]
            Arrays.setAll(arr, (i)->(int)(Math.random()*5)+1;  //arr = [1,5,2,1,1]

        4.배열의 정력과 검색 - sort(),binarySearch()

        Ex))   int[] arr = {3,2,0,1,4};
        int idx = Array.binarySearch(arr,2);   <=idx = -5 잘못된결과
        Arrays.sort(arr) <= 배열 arr 을 정렬한다
        sout(Arrays.toString(arr)); [0,1,2,3,4,]
        int idx = Arrays.binarySearch(arr,2);  <= idx = 2 올바른 결과

        5.배열을 List로 변환 - asList(Object ... a)
        EX)) List list = Arrays.asList(1,2,3,4,5);
        list.add(6)

        6.람다와 스트림 관련 - paralleXXX(), spliterato(),stream()

         */
    }
}
