package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner (System.in);
        int number = sc.nextInt();


     /*   «отрицательное четное число» - если число отрицательное и четное,
        «отрицательное нечетное число» - если число отрицательное и нечетное,
        «ноль» - если число равно 0,
        «положительное четное число» - если число положительное и четное,
        «положительное нечетное число» - если число положительное и нечетное.
    */
        if (number == 0) {
            System.out.println("ноль");
        }
        if (Math.abs(number % 2) == 0 & number < 0) {
            System.out.println("отрицательное четное число");
        }
        if (Math.abs(number % 2) != 0 & number < 0) {
            System.out.println("отрицательное нечетное число");
        }
        if (number % 2 == 0 & number > 0) {
            System.out.println("положительное четное число");
        }
        if (number % 2 != 0 & number > 0) {
            System.out.println("положительное нечетное число");
        }

    }
}
