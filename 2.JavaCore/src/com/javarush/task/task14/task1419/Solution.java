package com.javarush.task.task14.task1419;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            String[] s = new String[1];
            System.out.println(s[3]);

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            File file = new File("");
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            File file = new File("");
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new RuntimeException("asdf");
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new ArrayStoreException("asdf");
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new NoSuchMethodException("asdf");
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new NoSuchMethodException("asdf");
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new ClassNotFoundException("asdf");
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new IllegalArgumentException("asdf");
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new IndexOutOfBoundsException("asdf");
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new NegativeArraySizeException("asdf");
        } catch (Exception e) {
            exceptions.add(e);
        }



        //напишите тут ваш код

    }
}
