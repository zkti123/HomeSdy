package com.green.javaHome.sty.study_one.flow;

public class FlowEx5Method {
    public static void main(String[] args) {
        int star = 5;


        printStarLine(star);
        printStarLine(1);


        System.out.println("------------------------");
        printStarRect(4);
        System.out.println("------------------------");
        printStarTri(4);

    }
    public static void printStarTri(int star){
        for (int i = 0; i <=star; i++) {
            printStarLine(i);
        }
//            for (int j = 0; j <= i; j++) {
//
//                System.out.print("*");
//            }
//            System.out.println();
//        }

    }


    public static void printStarLine(int star) {

        for (int i = 0; i<star; i++){

            System.out.print("*");}


        System.out.println();
        return;
    }


    public static void printStarRect(int star){
        for (int i = 0; i<star; i++){
            printStarLine(star);

        }return;

    }
    }

