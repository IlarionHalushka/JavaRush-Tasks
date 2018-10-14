package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();
        br.close();

        FileInputStream fileInputStream = new FileInputStream(fileName);

        int max = 0;
        int fileInputStreamByte;

        while (fileInputStream.available() > 0) {
            if ((fileInputStreamByte = fileInputStream.read()) > max) {
                max = fileInputStreamByte;
            }
        }
        System.out.println(max);

        fileInputStream.close();
    }
}
