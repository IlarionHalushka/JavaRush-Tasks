package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";

        for (int i = 0; i < s.length() - 7; i++) {
            String subString = s.substring(i, s.length());
            System.out.println(subString);
        }
        //напишите тут ваш код
    }

}

