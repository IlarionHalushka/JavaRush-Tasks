package com.javarush.task.task18.task1823;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = "";

        while (!"exit".equals(fileName = br.readLine())) {
            ReadThread readThread = new ReadThread(fileName);
            readThread.start();
        }

        br.close();
    }

    public static class ReadThread extends Thread {
        public ReadThread(String fileName) throws IOException{
            FileInputStream fileInputStream = new FileInputStream(fileName);

            HashMap<Integer, Integer> bytes = new HashMap<>();

            while (fileInputStream.available() > 0) {
                bytes.merge(fileInputStream.read(), 1, Integer::sum);
            }

            if (!bytes.isEmpty()) {
                int max = Collections.max(bytes.values());

                int byteMax = bytes.entrySet()
                        .stream()
                        .filter(entry -> Objects.equals(entry.getValue(), max))
                        .map(Map.Entry::getKey)
                        .findFirst()
                        .get();

               // System.out.println(byteMax);
                resultMap.put(fileName, byteMax);
            }

            fileInputStream.close();


            //implement constructor body
        }
        // implement file reading here - реализуйте чтение из файла тут
    }
}
