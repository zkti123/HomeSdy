package com.green.javaHome.sty.study_one.lambda_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileViewer {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("파일 경로를 입력하세요.");
            return;
        }

        FileInputStream fis = null;
        try {
            fis = new FileInputStream(args[0]);
            int data;

            while ((data = fis.read()) != -1) {
                char c = (char) data;
                System.out.print(c);
            }
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");
        } catch (IOException e) {
            System.out.println("파일을 읽을 수 없습니다.");
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                System.out.println("파일을 닫는 중 오류가 발생했습니다.");
            }
        }
    }
}

