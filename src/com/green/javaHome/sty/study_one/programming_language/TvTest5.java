package com.green.javaHome.sty.study_one.programming_language;

public class TvTest5 {
    public static void main(String[] args) {

        CapTionTv ctv = new CapTionTv();
        ctv.channel = 10;
        ctv.channelUp();
        System.out.println(ctv.channel);

        ctv.displayCaption("Hello, World");
        ctv.caption = true;
        ctv.displayCaption("Hello, World");
    }
}
class CapTionTv extends Tv{
    boolean caption;

    void displayCaption(String texxt) {
        if (caption) {
            System.out.println(texxt);
        }
    }
}