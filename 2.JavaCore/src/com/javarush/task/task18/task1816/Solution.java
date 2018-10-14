package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        String fileName = args[0];
        FileInputStream fileInputStream = new FileInputStream(fileName);

        String content = "";

        while (fileInputStream.available() > 0) {
            content += (char) fileInputStream.read();
            //System.out.println(content);
        }
        content = content.toLowerCase();

        char[] contentChars = content.toCharArray();
        int countOfLetters = 0;

        for (int i = 0; i < contentChars.length; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (alphabet[j] == contentChars[i]) {
                    countOfLetters++;
                    break;
                }
            }
        }

        System.out.println(countOfLetters);

        fileInputStream.close();
    }
}
