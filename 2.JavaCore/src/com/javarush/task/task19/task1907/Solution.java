package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileFirst = br.readLine();

        FileReader fileReader = new FileReader(fileFirst);

        int symbol;
        String content = "";

        while ((symbol = fileReader.read() ) != -1) {
            content += (char) symbol;
        }

        Pattern pattern = Pattern.compile("\\bworld\\b");
        Matcher match = pattern.matcher(content);

        int matchCounter = 0;
        while (match.find()) {
            matchCounter++;
        }
        System.out.println(matchCounter);

        br.close();
        fileReader.close();
    }
}
