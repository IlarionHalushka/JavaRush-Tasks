package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        ArrayList<Character> vowels = new ArrayList<>();
        ArrayList<Character> consonants = new ArrayList<>();

        for (int i = 0; i < line.length(); i++) {
            char symbol = line.charAt(i);
            if (isVowel(symbol)) {
                vowels.add(line.charAt(i));
            }
            else if (symbol == " ".charAt(0)) {
                continue;
            }
            else {
                consonants.add(line.charAt(i));
            }
        }

        for (char el : vowels)
            System.out.print(el + " ");

       // System.out.println("\n");
        System.out.println();

        for (char el : consonants)
            System.out.print(el + " ");

        //напишите тут ваш код
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}