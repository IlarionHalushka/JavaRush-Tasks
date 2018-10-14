package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();

        if (first == second & second == third) {
            System.out.println(first + " " + second + " " + third);
        }
        else if (first == second) {
            System.out.println(first + " " + second);
        }
        else if (first == third) {
            System.out.println(first + " " + third);
        }
        else if (second == third) {
            System.out.println(second + " " + third);
        }

        //напишите тут ваш код
    }
}