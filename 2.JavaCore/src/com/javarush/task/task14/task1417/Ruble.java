package com.javarush.task.task14.task1417;

/**
 * Created by Admin on 1/7/2018.
 */
public class Ruble extends Money {
    public String getCurrencyName() {
        return "RUB";
    }
    public Ruble(double amount) {
        super(amount);
    }
}
