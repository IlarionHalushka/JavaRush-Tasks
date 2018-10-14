package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();
        br.close();

        FileInputStream fileInputStream = new FileInputStream(fileName);
        int countOfCommasInFile = 0;

        while (fileInputStream.available() > 0) {
            if (fileInputStream.read() == 44) {
                countOfCommasInFile++;
            }
        }
        fileInputStream.close();

        System.out.println(countOfCommasInFile);
    }
}
