package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;
import java.util.stream.Collectors;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException{
    /*    1. Считать с консоли имя файла.
        2. Вывести в консоль(на экран) содержимое файла.
        3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();
        br.close();

        InputStream inputReader = new FileInputStream(fileName);
        try {
            while (inputReader.available() > 0) {
                System.out.print((char) inputReader.read());
            }
            inputReader.close();
        } catch (Exception ex) {
            inputReader.close();
        }


        // напишите тут ваш код
    }
}