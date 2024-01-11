package com.green.javaHome.sty.study_one.trycatch;

public class TryCatchEx2 {
    public static void main(String[] args) {
        String str = "123a";


        try {
            int r1 = 10/0;
            int num = Integer.parseInt(str);
            System.out.println("num : " + num);//실행 안됨
            //예외가 발생될 가능성이 있는 로직(source) 위치
        }catch (ArithmeticException e){
            System.out.println("숫자 예외 발생");
        }catch (NumberFormatException e) {
            System.out.println("넘버포맷 예외 발생");
        } catch (Exception e) {
            e.printStackTrace();//에러 메세지 띄어줌.
            System.out.println("예외 발생");
            //예외가 발생되었을 때 하고 싶은 작업(로직) 위치
        } finally {
            System.out.println("파이널리");
            //옵션, 예외가 발생이 되든 안되든 무조건 실행하고 싶은 로직 위치.
        }
        System.out.println("끝");
    }
}
