package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileFirst = br.readLine();
        String fileSecond = br.readLine();

        BufferedReader fileBufferedReader = new BufferedReader(new FileReader(fileFirst));

        String line;
        String content = "";

        while ((line = fileBufferedReader.readLine()) != null) {
            content += line;
        }

        content = content.replaceAll("\\p{Punct}","");

        BufferedWriter fileBufferedWriter = new BufferedWriter(new FileWriter(fileSecond));
        fileBufferedWriter.write(content);

        br.close();
        fileBufferedReader.close();
        fileBufferedWriter.close();
    }
}
