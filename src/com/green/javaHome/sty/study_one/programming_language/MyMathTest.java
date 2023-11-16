package com.green.javaHome.sty.study_one.programming_language;

public class MyMathTest {
    public static void main(String[] args) {

        MyMath mm = new MyMath();

        long result1 = mm.add(5L, 3L);
        long result2 = mm.subtact(5L, 3L);
        long result3 = mm.multiply(5L, 3L);
        double result4 = mm.divide(5L, 3L);

        System.out.println("add(5L,3L) = " +result1);
        System.out.println("subtact(5L,3L) = " +result2);
        System.out.println("multiply(5L,3L) = " +result3);
        System.out.println("divide(5L,3L) = " +result4);


    }
}
class MyMath{
    long add(long a, long b) {
        long result = a+b;
        return result;
    }
    long subtact(long a ,long b) {
        return a-b;
    }

    long multiply(long a, long b) {
        return a*b;
    }

    double divide(long a, long b) {
        return a/b;
    }

}
