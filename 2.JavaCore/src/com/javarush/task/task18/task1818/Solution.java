package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String firstFile = br.readLine();
        String secondFile = br.readLine();
        String thirdFile = br.readLine();

        FileInputStream secondFileInputStream = new FileInputStream(secondFile);

        ArrayList<Integer> secondFileContent = new ArrayList<>();
        ArrayList<Integer> thirdFileContent = new ArrayList<>();

        // read content from second file
        while (secondFileInputStream.available() > 0) {
            secondFileContent.add(secondFileInputStream.read());
        }

        // write content from second file to first
        FileOutputStream firstFileOutputStream = new FileOutputStream(firstFile);
        for (Integer el : secondFileContent) {
            firstFileOutputStream.write(el);
        }

        FileInputStream thirdFileInputStream = new FileInputStream(thirdFile);
        // read content from third file
        while (thirdFileInputStream.available() > 0) {
            thirdFileContent.add(thirdFileInputStream.read());
        }

        // write content from third file to first
        for (Integer el : thirdFileContent) {
            firstFileOutputStream.write(el);
        }

        firstFileOutputStream.close();
        secondFileInputStream.close();
        thirdFileInputStream.close();
    }
}
