package com.green.javaHome.sty.study_one.flow;

public class ForEx1 {
    public static void main(String[] args) {
        int star= 6;
        for (int i= star; i>0; i--){
            for (int z=1; z<=star; z++){
                if (z <i){
                    System.out.print("_");
                }else{
                    System.out.printf("*");
                }
            }
            System.out.println();
        }
    }
}
