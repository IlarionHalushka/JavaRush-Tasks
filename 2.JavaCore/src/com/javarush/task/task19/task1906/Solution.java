package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileFirst = br.readLine();
        String fileSecond = br.readLine();

        FileReader fileReader = new FileReader(fileFirst);
        FileWriter fileWriter = new FileWriter(fileSecond);

        Integer symbol = fileReader.read();
        //System.out.println(symbol);

        while ((symbol = fileReader.read()) != -1) {
            fileWriter.write(symbol);
            fileReader.read();
        }

        br.close();
        fileWriter.close();
        fileReader.close();
    }
}
