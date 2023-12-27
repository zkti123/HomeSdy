package com.green.javaHome.sty.study_one.method;

public class TvTest3 {
    public static void main(String[] args) {
        Tv[] tvArr = new Tv[3]; //Tv tvArr1 ,tvArr2,tvArr3


        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i] = new Tv(); ///tvArr[i] <=객체 주소값이됨.
            tvArr[i].channel = 10+i;
            //Tv tv = new Tv();
//            tvArr[i] = tv;
//            tv.channel = 10 +i


        }

        System.out.println(tvArr[2].channel);


    }
}
