package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = new int[15];
        int amountOfCitizensEven = 0;
        int amountOfCitizensOdd = 0;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(bufferedReader.readLine());
        }

        for (int i = 0; i < array.length; i+=2) {
            amountOfCitizensEven += array[i];
        }

        for (int i = 1; i < array.length; i+=2) {
            amountOfCitizensOdd += array[i];
        }

        if (amountOfCitizensEven > amountOfCitizensOdd) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
        else if (amountOfCitizensEven < amountOfCitizensOdd) {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
        //напишите тут ваш код
    }
}
