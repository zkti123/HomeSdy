package com.green.javaHome.sty.study_one;

public class Ex09_01 {
    public static void main(String[] args) {
        int iVal = 100;
        String strVal = String.valueOf(iVal);

        double fVal = 200.0;
        String strVal2 = fVal + "";

        double sum = Integer.parseInt("+"+strVal)+Double.parseDouble(strVal2);

        double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2) ;

        System.out.println(String.join("", strVal, "+", strVal2, "="+sum));
        System.out.println(strVal+"+"+strVal2+"="+sum2);
    }
}
