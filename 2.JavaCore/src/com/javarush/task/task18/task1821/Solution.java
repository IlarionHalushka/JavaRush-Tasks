package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String firstFile = args[0];
        //String firstFile = br.readLine();

        InputStreamReader fileInputStream = new InputStreamReader(new FileInputStream(firstFile), "US-ASCII");
        ArrayList<Integer> fileContent = new ArrayList<>();

        int s;
        while ((s = fileInputStream.read()) != -1) {
            fileContent.add( s );
        }

        Collections.sort(fileContent);

        Map<Integer, Integer> bytes = new TreeMap<>();

        for (int i = 0; i < fileContent.size(); i++) {
            bytes.merge(fileContent.get(i), 1, Integer::sum);
        }

        for (Map.Entry<Integer, Integer> entry : bytes.entrySet()) {
            System.out.println((char)(int)(entry.getKey()) + " " + entry.getValue());
        }

        fileInputStream.close();
    }
}
