package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();

        //String id = "22";
        int id = Integer.parseInt(args[0]);

        BufferedReader br2 = new BufferedReader(new FileReader(fileName));
        String s;
        while ( (s = br2.readLine()) != null) {
            String[] params = s.split(" ");

            if (Integer.parseInt(params[0]) == id) {
                for (int i = 0; i < params.length; i++) {
                    System.out.print(params[i] + " ");
                }
                break;
            }
        }

        br2.close();
        br.close();

    }
}
