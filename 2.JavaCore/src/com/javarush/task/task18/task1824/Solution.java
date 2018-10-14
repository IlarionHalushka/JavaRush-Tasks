package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        boolean exceptionThrows = false;

        while (!exceptionThrows) {
            fileName = br.readLine();
            try {
                FileInputStream fileInputStream = new FileInputStream(fileName);
                fileInputStream.close();
            } catch (FileNotFoundException e) {
                System.out.println(fileName);
                exceptionThrows = true;
            }
        }
        br.close();


    }
}
