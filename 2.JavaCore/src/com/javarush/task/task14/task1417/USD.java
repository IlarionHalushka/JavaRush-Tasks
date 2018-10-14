package com.javarush.task.task14.task1417;

/**
 * Created by Admin on 1/7/2018.
 */
public class USD extends Money {
    public String getCurrencyName() {
        return "USD";
    }
    public USD(double amount) {
        super(amount);
    }
}
