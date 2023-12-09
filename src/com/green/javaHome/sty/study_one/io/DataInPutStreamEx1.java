package com.green.javaHome.sty.study_one.io;

import java.io.*;

public class DataInPutStreamEx1 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        DataOutputStream dos = null;

        try {
            fos = new FileOutputStream("sample.dat");
            dos = new DataOutputStream(fos);
            dos.writeInt(10);
            dos.writeFloat(20.0f);
            dos.writeBoolean(true);
            dos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
