package com.green.javaHome.sty;

public class EX57{
    public static void main(String[] args) {
        System.out.println("매개면수의 개수 : " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("args["+i+"]=\""+args[i]+"\"");
        }
    }
}
