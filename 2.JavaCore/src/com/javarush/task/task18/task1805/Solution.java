package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();
        br.close();

        FileInputStream fileInputStream = new FileInputStream(fileName);

        HashSet<Integer> setBytes = new HashSet<>();

        while (fileInputStream.available() > 0) {
            setBytes.add(fileInputStream.read());
        }

        List listBytes = new ArrayList(setBytes);
        Collections.sort(listBytes);
       // System.out.println(listBytes);

        if (!listBytes.isEmpty()) {
            listBytes.forEach(e -> System.out.print(e + " "));
        }

        fileInputStream.close();
    }
}
