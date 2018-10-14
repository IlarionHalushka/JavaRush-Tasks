package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = br.readLine();
        String fileName2 = br.readLine();
        String fileName3 = br.readLine();
        br.close();

        FileInputStream fileInputStream = new FileInputStream(fileName1);
        double countOfBytesWriteFirstFile =   Math.ceil((double) fileInputStream.available() / 2);
        double countOfBytesWriteSecondFile =   Math.floor((double) fileInputStream.available() / 2);

        FileOutputStream file2OutputStream = new FileOutputStream(fileName2);
        FileOutputStream file3OutputStream = new FileOutputStream(fileName3);

        byte[] buffer = new byte[fileInputStream.available()];
        fileInputStream.read(buffer);

        file2OutputStream.write(buffer, 0, (int) countOfBytesWriteFirstFile);
        file3OutputStream.write(buffer,  (int) countOfBytesWriteFirstFile, (int) countOfBytesWriteSecondFile);

/*
        System.out.println(fileInputStream.available());
        System.out.println(countOfBytesWriteFirstFile);
        System.out.println(countOfBytesWriteSecondFile);*/

        fileInputStream.close();
        file2OutputStream.close();
        file3OutputStream.close();
       /* while (fileInputStream.available() > 0) {
           break;
        }*/
    }
}
