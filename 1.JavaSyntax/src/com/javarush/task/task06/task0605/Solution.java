package com.javarush.task.task06.task0605;


import java.io.*;

/* 
Контролируем массу тела
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.massIndex(weight, height);
    }

    public static class Body {
        public static void massIndex(double weight, double height) {

           /* Контролируем массу тела
            Программа должна считывать введенные пользователем вес в килограммах и рост в метрах и выводить на экран сообщение о индексе массы тела.
                    Реализуй статический метод класса Body. Метод должен определить индекс массы тела, и вывести на экран сообщение:
            "Недовес: меньше чем 18.5" - если индекс массы тела меньше 18.5,
                    "Нормальный: между 18.5 и 24.9" - если индекс массы тела между 18.5 и 24.9,
                    "Избыточный вес: между 25 и 29.9" - если индекс массы тела между 25 и 29.9,
                    "Ожирение: 30 или больше" - если индекс массы тела 30 или больше.

            Подсказка:
            Индекс массы тела = вес в кг / (рост в метрах * рост в метрах)*/

            double massIndex = weight / (height * height);

            if (massIndex < 18.5) {
                System.out.println("Недовес: меньше чем 18.5");
            }

            if (massIndex >= 18.5 & massIndex <= 24.9) {
                System.out.println("Нормальный: между 18.5 и 24.9");
            }

            if (massIndex <= 29.9 & massIndex >= 25) {
                System.out.println("Избыточный вес: между 25 и 29.9");
            }

            if (massIndex >= 30) {
                System.out.println("Ожирение: 30 или больше");
            }



            //напишите тут ваш код
        }
    }
}
