package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double minute = sc.nextDouble();

        while (minute >= 5) {
            minute -= 5;
        }

        if (minute < 3) {
            System.out.println("зелёный");
        }
        else if (minute >= 3 & minute < 4) {
            System.out.println("желтый");
        }
        else if ( minute >= 4 ) {
            System.out.println("красный");
        }
    }
}