package com.green.javaHome.sty.study_one.method;

public class TvTest4 {
    public static void main(String[] args) {
        Tv[] tvArr = new Tv[3]; // tvArr0,tvArr1,tvAr23
        Tv tv = new Tv();

        for(int i=0; i<tvArr.length; i++) {
            tvArr[i] = tv;
            //tvArr[0] = tvArr[tv], tvArr[1] = tvArr[tv], tvArr[2] = tvArr[tv]
            tvArr[i].channel = 10;//tvArr[i].channel = 10 == tv.channel = 10와 같다.
        }



        System.out.println(tvArr[0].channel); // 1,
        System.out.println(tvArr[1].channel); // 1,
        System.out.println(tvArr[2].channel); // 10,
        System.out.println(tv.channel); // 10,

        String str = "dd";
        for(int i=0; i<tvArr.length; i++) {
            System.out.println(tvArr[i]);
        }
        System.out.println(tv);

    }
}
