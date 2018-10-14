package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String firstFile = br.readLine();
        String secondFile = br.readLine();

        FileInputStream firstFileInputStream = new FileInputStream(firstFile);
        byte[] firstFileContent = new byte[firstFileInputStream.available()];

        // read content from first file
        while (firstFileInputStream.available() > 0) {
            firstFileInputStream.read(firstFileContent);
        }


        FileInputStream secondFileInputStream = new FileInputStream(secondFile);
        byte[] secondFileContent = new byte[secondFileInputStream.available()];

        // read content from second file
        while (secondFileInputStream.available() > 0) {
            secondFileInputStream.read(secondFileContent);
        }

        FileOutputStream firstFileOutputStream = new FileOutputStream(firstFile);
        // write content from second file to first
        firstFileOutputStream.write(secondFileContent, 0, secondFileContent.length);
        // write content from first file to first
        firstFileOutputStream.write(firstFileContent, 0, firstFileContent.length);


        firstFileOutputStream.close();
        secondFileInputStream.close();
        firstFileInputStream.close();
    }
}
