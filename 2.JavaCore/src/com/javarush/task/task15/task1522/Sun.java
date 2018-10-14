package com.javarush.task.task15.task1522;

/**
 * Created by Admin on 1/9/2018.
 */
public class Sun implements Planet {
    private static Sun instance;

    private Sun() {
    }

    public static synchronized Sun getInstance() {
        if (instance == null) {
            instance = new Sun();
        }
        return instance;
    }
}
