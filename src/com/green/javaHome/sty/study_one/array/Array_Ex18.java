package com.green.javaHome.sty.study_one.array;

public class Array_Ex18 {
    public static void main(String[] args) {
        //배열: 같은 타입의 여러값을 저장하기 위한 공간
        //얕은복사
        //깊은 복사
        int[] numArr = new int[]{10,20,30,40,50};
        int[] copyArr = numArr; //얕은 복사 : 주소값만 복사한다.

        for (int i = 0; i < copyArr.length; i++) {
            System.out.printf("copyArr[%d] : %d\n", i , copyArr[i]);
        }

    }
}
