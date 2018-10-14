package com.javarush.task.task14.task1421;

/**
 * Created by Admin on 1/8/2018.
 */
public class Singleton {

    private static Singleton instance = new Singleton();
    private Singleton() {

    }

    public static Singleton getInstance() {
        return instance;
    }
}
