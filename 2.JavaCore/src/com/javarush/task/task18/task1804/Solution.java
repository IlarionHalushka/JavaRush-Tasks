package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();
        br.close();

        FileInputStream fileInputStream = new FileInputStream(fileName);

        HashMap<Integer, Integer> bytes = new HashMap<>();

        while (fileInputStream.available() > 0) {
            bytes.merge(fileInputStream.read(), 1, Integer::sum);
        }

        if (!bytes.isEmpty()) {
            int min = Collections.min(bytes.values());

            bytes.entrySet()
                    .stream()
                    .filter(entry -> Objects.equals(entry.getValue(), min))
                    .map(Map.Entry::getKey)
                    .forEach(e-> System.out.print(e + " "));
        }

        fileInputStream.close();
    }
}
