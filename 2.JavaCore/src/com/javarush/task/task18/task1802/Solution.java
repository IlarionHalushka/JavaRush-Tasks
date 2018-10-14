package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();
        br.close();

        FileInputStream fileInputStream = new FileInputStream(fileName);

        int max = 255;
        int fileInputStreamByte;

        while (fileInputStream.available() > 0) {
            if ((fileInputStreamByte = fileInputStream.read()) < max) {
                max = fileInputStreamByte;
            }
        }
        System.out.println(max);

        fileInputStream.close();
    }
}
