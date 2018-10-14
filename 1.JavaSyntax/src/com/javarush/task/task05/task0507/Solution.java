package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();

        int number = sc.nextInt();

        if ( number != -1 ) {
            do {
                array.add( number );
                number = sc.nextInt();
            } while ( number != -1 );

            int sum = 0;

            for ( int i = 0; i < array.size(); i++ ) {
                sum += array.get(i);
            }

            double average = (double) sum / array.size();

            System.out.println(average);
        }


        //1 2 2 4 5 -1

        //напишите тут ваш код
    }
}

