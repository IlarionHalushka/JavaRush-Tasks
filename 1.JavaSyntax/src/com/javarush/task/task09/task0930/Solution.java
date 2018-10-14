package com.javarush.task.task09.task0930;

import javafx.collections.transformation.SortedList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        ArrayList<String> numbers = new ArrayList<String>();
        ArrayList<String> strings = new ArrayList<>();

        for (String s : array) {
            if (isNumber(s)) {
                numbers.add(s);
            } else {
                strings.add(s);
            }
        }

        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < numbers.size(); j++) {
                if (Integer.parseInt(numbers.get(j)) < Integer.parseInt(numbers.get(i))) {
                    String sJ = numbers.get(j);
                    String sI = numbers.get(i);

                    numbers.remove(i);
                    numbers.add(i, sJ);
                    numbers.remove(j);
                    numbers.add(j, sI);
                }
            }
        }

        for (int i = 0; i < strings.size(); i++) {
            for (int j = 0; j < strings.size(); j++) {
                if (isGreaterThan(strings.get(j), strings.get(i))) {
                    String sJ = strings.get(j);
                    String sI = strings.get(i);

                    strings.remove(j);
                    strings.add(j, sI);
                    strings.remove(i);
                    strings.add(i, sJ);
                }
            }
        }

        String[] arrayCopy = new String[array.length];

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) {
                arrayCopy[i] = numbers.get(j);
                j++;
            }
        }

        j = 0;
        for (int i = 0; i < array.length; i++) {
            if (!isNumber(array[i])) {
                arrayCopy[i] = strings.get(j);
                j++;
            }
        }

        System.arraycopy(arrayCopy, 0, array, 0, arrayCopy.length);

        //напишите тут ваш код
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-')) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}
