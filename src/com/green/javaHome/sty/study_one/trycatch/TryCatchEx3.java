package com.green.javaHome.sty.study_one.trycatch;

public class TryCatchEx3 {
    public static void main(String[] args) {
        int r = div(10, 3);
        System.out.println("r : " + r);

    }

    public static int div(int n1, int n2) {
        int r = 0;
        try {
            r = n1 / n2;
            if (r % 2 == 0) ;
            {
                return 100;
            }
        } catch (ArithmeticException | NumberFormatException e2) {

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("파이널리");
        }
        return r;

    }
}
