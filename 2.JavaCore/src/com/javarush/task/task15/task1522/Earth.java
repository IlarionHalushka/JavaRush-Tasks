package com.javarush.task.task15.task1522;

/**
 * Created by Admin on 1/9/2018.
 */
public class Earth implements Planet {
    private static Earth instance;

    private Earth() {
    }

    public static synchronized Earth getInstance() {
        if (instance == null) {
            instance = new Earth();
        }
        return instance;
    }
}
