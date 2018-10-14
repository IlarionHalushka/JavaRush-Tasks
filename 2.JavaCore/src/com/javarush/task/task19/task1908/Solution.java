package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileFirst = br.readLine();
        String fileSecond = br.readLine();

        BufferedReader fileBufferedReader = new BufferedReader(new FileReader(fileFirst));

        String line;
        String content = "";

        while ((line = fileBufferedReader.readLine()) != null) {
            content += line;
        }

        String[] contentWords = content.split(" ");
        String contentNumbersAndDashes = "";

        for (int i = 0; i < contentWords.length; i++) {
            try {
                int number = Integer.parseInt(contentWords[i]);
                contentNumbersAndDashes += number + " ";
            }
            catch (Exception e) {
            }
        }

        BufferedWriter fileBufferedWriter = new BufferedWriter(new FileWriter(fileSecond));
        fileBufferedWriter.write(contentNumbersAndDashes);

        br.close();
        fileBufferedReader.close();
        fileBufferedWriter.close();
    }
}
