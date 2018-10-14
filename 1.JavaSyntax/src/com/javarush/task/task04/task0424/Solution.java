package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();

        if ( first == second & third != second ) {
            System.out.println("3");
        }
        else if ( third == second & first != third ) {
            System.out.println("1");
        }
        else if ( first == third & second != first ) {
            System.out.println("2");
        }
        //напишите тут ваш код
    }
}
