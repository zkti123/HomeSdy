package com.green.javaHome.sty.study_one.io;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx2 {
    public static void main(String[] args) {
        int sum = 0;
        try {
            RandomAccessFile file = new RandomAccessFile("score2.dat", "r");
            int i = 4;
            while (true) {
                file.seek(i);
                sum += file.readInt();
                i += 16;
            }
        } catch (EOFException e) {
            System.out.println("sum : " + sum);
        } catch (IOException a) {
            a.printStackTrace();
        }
    }
}
