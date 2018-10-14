package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        array.add(sc.nextInt());
        array.add(sc.nextInt());
        array.add(sc.nextInt());

        long counter = array.stream()
                .filter(el -> el > 0)
                .count();

        System.out.println(counter);
    }
}
