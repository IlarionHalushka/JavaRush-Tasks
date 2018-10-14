package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String id;
        String name;
        HashMap<String, Integer> map = new HashMap<>();

        while (true) {
            id = reader.readLine();
            if (id.isEmpty()) break;
            name = reader.readLine();
            if (name.isEmpty()) break;

            map.put(name, Integer.parseInt(id));
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getValue() + " " + entry.getKey());
        }
    }
}
