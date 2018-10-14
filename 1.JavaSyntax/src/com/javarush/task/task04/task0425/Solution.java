package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();

        if ( X > 0 & Y > 0 ) {
            System.out.println(1);
        }
        if ( X < 0 & Y < 0 ) {
            System.out.println(3);
        }
        if ( X > 0 & Y < 0 ) {
            System.out.println(4);
        }
        if ( X < 0 & Y > 0 ) {
            System.out.println(2);
        }

        //напишите тут ваш код
    }
}
