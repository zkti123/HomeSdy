package com.green.javaHome.sty.study_one.method;


public class MemberCall11 {
    int iv = 10;
    static int cv = 20;

    int iv2 = cv;

    //static int cv2 = iv;  <<< 에러. 클래스 변수는 인스턴스 변수를 사용할 수 없음.
    static int cv2 = new MemberCall11().iv; // 이처럼 객체 생성을 해야만 가능

    static void stticMethod1(){
        System.out.println("stticMethod1 cv : "+cv);
        //System.out.println(iv); <<< 에러. 클래스메서드에서 인스턴스 변수를 사용불가.
        MemberCall11 c = new MemberCall11();
        System.out.println("stticMethod1 iv : "+c.iv); // 객체를 생성한 후에야 인스턴스 변수 참조가능.
    }

    void instanceMethod1(){
        System.out.println("instanceMethod1 cv : "+cv);
        System.out.println("instanceMethod1 iv : "+iv);
    }

    static void staticMethod2(){
        stticMethod1();
        //instanceMethod1(); <<< 에러. 클래스메서드에서 인스턴스 메서드 호출 할수 없음.
        MemberCall11 c = new MemberCall11();
       c.instanceMethod1(); // << 이처럼 인스턴스 생성을 해야만 호출 할 수 있다.
    }

    void instanceMethod2(){     // 인스턴스 메서드에서는 인스턴스 메서드와 클래스 메서드
         stticMethod1();        // 모두 인스턴스 생성없이 바로 호출이 가능하다.
        instanceMethod1();
    }
}
class MemberCallTest11{
    public static void main(String[] args) {
        System.out.println("MemberCall11 cv2: "+MemberCall11.cv2);
        System.out.println("MemberCall11 cv: "+MemberCall11.cv);


        System.out.println("========================================");

        MemberCall11 mc = new MemberCall11();
        mc.instanceMethod1();
        System.out.println("========================================");
        mc.instanceMethod2();

        System.out.println("========================================");

        MemberCall11.staticMethod2();


    }
}