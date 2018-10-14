package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();

        BufferedWriter outputWriter = new BufferedWriter(new FileWriter(fileName));

        String s;
        do {
            s = br.readLine();
            outputWriter.write(s);
            outputWriter.newLine();
        } while (!"exit".equals(s));



        br.close();
        outputWriter.close();

        // напишите тут ваш код
    }
}
