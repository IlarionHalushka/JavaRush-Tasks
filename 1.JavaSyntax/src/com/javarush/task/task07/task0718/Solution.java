package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> strings = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10 ; i++) {
            strings.add(br.readLine());
        }

        int index;
        for (int i = 0; i < strings.size() - 1; i++) {
            if ( strings.get( i + 1 ).length() < strings.get(i).length() ) {
                index = i + 1;
                System.out.println(index);
                break;
            }
        }




        //напишите тут ваш код
    }
}

