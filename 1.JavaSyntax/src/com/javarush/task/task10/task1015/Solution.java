package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        @SuppressWarnings("unchecked")
        ArrayList<String>[] list = new ArrayList[5];
        for( int i = 0; i < 5; i++) {
            list[i] = new ArrayList<String>(){{
                add("asdf");
                add("asdff");
            }};
        }
        //напишите тут ваш код

        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}