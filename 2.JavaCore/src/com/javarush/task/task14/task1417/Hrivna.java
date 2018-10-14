package com.javarush.task.task14.task1417;

import java.util.HashMap;

/**
 * Created by Admin on 1/7/2018.
 */
public class Hrivna extends Money {
    public String getCurrencyName() {
        return "HRN";
    }

    public Hrivna(double amount) {
        super(amount);
    }
}
