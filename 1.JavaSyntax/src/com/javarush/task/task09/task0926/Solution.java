package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

/*Список из массивов чисел
        Создать список, элементами которого будут массивы чисел.
        Добавить в список пять объектов-массивов длиной 5, 2, 4, 7, 0 соответственно.
        Заполнить массивы любыми данными и вывести их на экран.


        Требования:
        1. Метод createList должен объявлять и инициализировать переменную типа ArrayList.
        2. Метод createList должен возвращать созданный список.
        3. Метод createList должен добавлять в список 5 элементов.
        4. Каждый элемент в списке должен быть массивом чисел. Длина первого должна быть 5 элементов, второго - 2,
         следующих - 4, 7, 0 соответственно.
        5. Программа должна выводить на экран элементы всех массивов из списка. Каждый элемент с новой строки.*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> arrayList = new ArrayList<>();
        int[] first = new int[5];
        first[0] = 1;
        first[1] = 1;
        first[2] = 1;
        first[3] = 1;
        first[4] = 1;
        arrayList.add(first);

        int[] second = new int[2];
        second[0] = 1;
        second[1] = 1;
        arrayList.add(second);

        int[] third = new int[4];
        third[0] = 1;
        third[1] = 1;
        third[2] = 1;
        third[3] = 1;
        arrayList.add(third);

        int[] fourth = new int[7];
        fourth[0] = 1;
        fourth[1] = 1;
        fourth[2] = 1;
        fourth[3] = 1;
        fourth[4] = 1;
        fourth[5] = 1;
        fourth[6] = 1;
        arrayList.add(fourth);

        int[] fifth = new int[0];
        arrayList.add(fifth);

        return arrayList;
        //напишите тут ваш код
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
