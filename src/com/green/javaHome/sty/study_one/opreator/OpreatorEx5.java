package com.green.javaHome.sty.study_one.opreator;

public class OpreatorEx5 {
    public static void main(String[] args) {
        //미만, 초과 <>
        //이하, 이상 <=, =>

        System.out.println("2<2:" + (2<2));
        System.out.println("1<2:" + (1<2));
        System.out.println("2<=2:" + (2<=2));
        System.out.println("1<=2:" + (1<=2));
        System.out.println("2>2:" + (2>2));
        System.out.println("2>=2:" + (2>=2));
        System.out.println("2==2:" + (2==2));
        System.out.println("2==3:" + (2==3));
        System.out.println("2!=3:" + (2!=3));
        System.out.println("2!=2:" + (2!=2));

        System.out.println("!(2 !=2):" + !(2!=2)); // !논리 연산자 뒤에는 무조건boolean타입 들어가야된다


    }
}
