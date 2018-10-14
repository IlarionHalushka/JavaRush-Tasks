package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        FileInputStream fileInputStream = new FileInputStream(fileName);

        ArrayList<Integer> content = new ArrayList<>();

        while (fileInputStream.available() > 0) {
            content.add(fileInputStream.read());
        }

        int symbolsCount = content.size();
        int dashesCount = 0;

        for (int symbol : content) {
            if (32 == symbol) {
                dashesCount++;
            }
        }

        double result = (double) dashesCount / (double) symbolsCount * 100;
        System.out.println(String.format("%.2f", result));
        fileInputStream.close();
    }
}
