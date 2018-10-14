package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<String> strings = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10 ; i++) {
            strings.add(br.readLine());
        }

        int longestStringIndex = 0;
        int shortestStringIndex = 0;

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() > strings.get(longestStringIndex).length() ) {
                longestStringIndex = i;
            }
            if (strings.get(i).length() < strings.get(shortestStringIndex).length() ) {
                shortestStringIndex = i;
            }
        }

        if (shortestStringIndex > longestStringIndex) {
            System.out.println(strings.get(longestStringIndex));
        }
        else {
            System.out.println(strings.get(shortestStringIndex));
        }
        //напишите тут ваш код
    }
}
