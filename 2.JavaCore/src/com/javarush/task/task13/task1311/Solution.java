package com.javarush.task.task13.task1311;

/* 
Нанимаем переводчика
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        EnglishTranslator englishTranslator = new EnglishTranslator();
        System.out.println(englishTranslator.translate());
    }


 /*   1. Создать класс EnglishTranslator, который наследуется от Translator.
            2. Реализовать все абстрактные методы.
            3. Подумай, что должен возвращать метод getLanguage.
    4. Программа должна выводить на экран "Я переводчик с английского" путем вызова метода translate у объекта типа EnglishTranslator.
    */

    public static abstract class Translator {
        public abstract String getLanguage();

        public String translate() {
            return "Я переводчик с " + getLanguage();
        }
    }

    public static class EnglishTranslator extends Translator {
        public String getLanguage() {return "английского";};
    }

}