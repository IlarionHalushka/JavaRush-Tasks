package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        int NOD = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int first =  Integer.parseInt(br.readLine());
        int second = Integer.parseInt(br.readLine());
        br.close();

        if (first <= 0 || second <= 0) {
            throw new NumberFormatException();
        }

        int max = first > second ? first : second;

        for (int i = 1; i <= max; i++) {
            if (first % i == 0 && second % i == 0) {
                NOD = i;
            }
        }

        System.out.println(NOD);
    }
}
