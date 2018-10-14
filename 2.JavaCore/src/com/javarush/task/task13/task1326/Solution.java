package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/


import java.io.*;
import java.util.ArrayList;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {

     /*   1. Ввести имя файла с консоли.
        2. Прочитать из него набор чисел.
        3. Вывести на консоль только четные, отсортированные по возрастанию.*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();

        InputStream inputReader = new FileInputStream(fileName);
        ArrayList<Integer> array = new ArrayList<>();

        Scanner scanner = new Scanner(inputReader);
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            array.add(number);
        }

        Collections.sort(array);
        for (int el : array) {
            if (el % 2 == 0) {
                System.out.println(el);
            }
        }

        inputReader.close();
        br.close();




        // напишите тут ваш код
    }
}
