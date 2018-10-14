package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }


    public static void readData() {
        ArrayList<Integer> array = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                int line = Integer.parseInt(br.readLine());
                array.add(line);
            }
        }
        catch (Exception e) {
            for (int elem : array) {
                System.out.println(elem);
            }
        }
        //напишите тут ваш код

    }
}
