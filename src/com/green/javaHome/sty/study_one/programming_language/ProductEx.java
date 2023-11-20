package com.green.javaHome.sty.study_one.programming_language;

public class ProductEx {
    static int count = 0;
    int serialNo;
    {
        ++count;
        serialNo = count;
    }
    public ProductEx() {

    }

    public static void main(String[] args) {
        ProductEx p1 = new ProductEx();
        ProductEx p2 = new ProductEx();
        ProductEx p3 = new ProductEx();

        System.out.println("p1의 제품번호(serial no)는 " +p1.serialNo);
        System.out.println("p2의 제품번호(serial no)는 " +p2.serialNo);
        System.out.println("p3의 제품번호(serial no)는 " + p3.serialNo);
        System.out.println("생산된 제품의 수는 모두 " + ProductEx.count+"개 입니다.");
    }
}
