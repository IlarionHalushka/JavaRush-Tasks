package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        reset();
        //add your code here - добавьте код тут
    }

    public static Flyable result;

    public static void reset() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        try {
            s = br.readLine();

            if ("helicopter".equals(s)) {
                result = new Helicopter();
            }

            if ("plane".equals(s)) {
                int passengersAmount = Integer.parseInt(br.readLine());
                result = new Plane(passengersAmount);
            }

            br.close();

        } catch (Exception e) {

        }
        //add your code here - добавьте код тут
    }
}
