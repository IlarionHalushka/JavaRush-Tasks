package com.javarush.task.task15.task1522;

/**
 * Created by Admin on 1/9/2018.
 */
public class Moon implements Planet {
    private static Moon instance;

    private Moon() {
    }

    public static synchronized Moon getInstance() {
        if (instance == null) {
            instance = new Moon();
        }
        return instance;
    }
}
