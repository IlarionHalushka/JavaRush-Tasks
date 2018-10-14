package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        Map<Character, Integer> amountOfLetterEntries = new HashMap<>();
        for (Character ch : alphabet) {
            amountOfLetterEntries.put(ch, 0);
        }

        for (String s : list) {
            for (Character character : alphabet) {
                for (int i = 0; i < s.length(); i++) {
                    while (s.indexOf(character, i) > -1) {
                        amountOfLetterEntries.put(character, amountOfLetterEntries.get(character) + 1);
                        i = s.indexOf(character, i) + 1;
                    }
                }
            }
        }

        for (int i = 0; i < alphabet.size(); i++) {
            System.out.println(alphabet.get(i) + " " + amountOfLetterEntries.get(alphabet.get(i)));
        }
        // напишите тут ваш код
    }

}
