package com.green.javaHome.sty.study_one.lambda_stream;

@FunctionalInterface
interface MyFunction3 {
    void myMethod();
}

class Outer {
    int val = 10;

    class Inner {
        int val = 20;

        void method(int i) { // <<== void method(final int i){}
            int val = 30;  // <<  final int val = 30;
          //  i = 10; 에러 상수값은 변경불가
            MyFunction3 f = () ->{
                System.out.println("         i : " + i);
                System.out.println("       val : " + val);
                System.out.println("  this.val : " + ++this.val);
                System.out.println("Outer.this.val : " +  ++Outer.this.val);
            };
            f.myMethod();
        }
    }
}
public class LambdaEx3 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.method(100);
    }
}
