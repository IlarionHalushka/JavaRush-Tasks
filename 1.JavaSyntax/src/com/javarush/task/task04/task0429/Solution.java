package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        array.add(sc.nextInt());
        array.add(sc.nextInt());
        array.add(sc.nextInt());

        long counterPositive = array.stream()
                .filter(el -> el > 0)
                .count();

        long counterNegative = array.stream()
                .filter(el -> el < 0)
                .count();

        System.out.println("количество отрицательных чисел: " + counterNegative);
        System.out.println("количество положительных чисел: " + counterPositive);
    }
}
