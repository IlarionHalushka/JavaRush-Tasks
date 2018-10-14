package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {

        ArrayList<Integer> strings = new ArrayList<Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10 ; i++) {
            strings.add(Integer.parseInt(br.readLine()));
        }

        int l = 1;
        ArrayList<Integer> maxList = new ArrayList<>();
        maxList.add(l);

        for (int i = 0; i < strings.size() - 1; i++) {
            if ( strings.get(i).equals( strings.get(i+1)) ) {
                l++;
                maxList.add(l);
            }
            else {
                l = 1;
            }
        }

        final Comparator<Integer> comp = (p1, p2) -> Integer.compare( p1, p2);
        System.out.println(maxList.stream().max(comp).get());
        //напишите тут ваш код
    }
}