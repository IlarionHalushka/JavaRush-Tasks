package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        while (!"exit".equals(line)) {
            try {
                double numberParsed = Double.parseDouble(line);
                if (line.contains(".")) {
                    print( Double.parseDouble( line ));
                }
                else if (numberParsed > 0 && numberParsed < 128) {
                    print((short) numberParsed);
                }
                else if (numberParsed <= 0 || numberParsed >= 128) {
                    print((int) numberParsed);
                }

            }
            catch (NumberFormatException e) {
                print(line);
            }

            line = br.readLine();
        }
        //напиште тут ваш код
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
