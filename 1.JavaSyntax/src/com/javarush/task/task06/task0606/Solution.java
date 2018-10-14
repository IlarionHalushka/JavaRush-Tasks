package com.javarush.task.task06.task0606;



import java.io.*;
import java.util.Scanner;


/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        while (number >= 1) {
            int module = number % 10;
            number = number / 10;

            if (isNumberEven( module )) {
                even++;
            }
            else {
                odd++;
            }
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }

    public static boolean isNumberEven(int number) {
        return number % 2 == 0;
    }

}
