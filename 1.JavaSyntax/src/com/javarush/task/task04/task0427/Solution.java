package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

      /*  Ввести с клавиатуры целое число в диапазоне 1 - 999. Вывести его строку-описание следующего вида:
        «четное однозначное число» - если число четное и имеет одну цифру,
        «нечетное однозначное число» - если число нечетное и имеет одну цифру,
        «четное двузначное число» - если число четное и имеет две цифры,
        «нечетное двузначное число» - если число нечетное и имеет две цифры,
        «четное трехзначное число» - если число четное и имеет три цифры,
        «нечетное трехзначное число» - если число нечетное и имеет три цифры.
        Если введенное число не попадает в диапазон 1 - 999, в таком случае ничего не выводить на экран.

                Пример для числа 100:
        четное трехзначное число

        Пример для числа 51:
        нечетное двузначное число*/
        if ( isNumberInInterval( number ) & isNumberEven( number ) & isNumberHasThreeDigits( number ) ) {
            System.out.println("четное трехзначное число");
        }
        if ( isNumberInInterval( number ) & isNumberOdd(number) & isNumberHasThreeDigits(number) ) {
            System.out.println("нечетное трехзначное число");
        }
        if ( isNumberInInterval( number ) & isNumberEven( number ) & isNumberHasTwoDigits(number) ) {
            System.out.println("четное двузначное число");
        }
        if ( isNumberInInterval( number ) & isNumberOdd( number ) & isNumberHasTwoDigits(number) ) {
            System.out.println("нечетное двузначное число");
        }
        if ( isNumberInInterval( number ) & isNumberEven( number ) & isNumberHasOneDigit(number) ) {
            System.out.println("четное однозначное число");
        }
        if ( isNumberInInterval( number ) & isNumberOdd( number) & isNumberHasOneDigit(number) ) {
            System.out.println("нечетное однозначное число");
        }
    }

    public static boolean isNumberInInterval (int number) {
        return number >= 1 & number <= 999;
    }

    public static boolean isNumberEven (int number) {
        return number % 2 == 0;
    }

    public static boolean isNumberOdd (int number) {
        return number % 2 != 0;
    }

    public static boolean isNumberHasThreeDigits (int number) {
        return number / 100 >= 1 & number / 100 <= 10;
    }

    public static boolean isNumberHasTwoDigits (int number) {
        return number / 10 >= 1 & number / 10 <= 9;
    }

    public static boolean isNumberHasOneDigit (int number) {
        return number >= 1 & number <= 9;
    }




}
