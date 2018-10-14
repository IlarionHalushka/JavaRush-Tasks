package com.javarush.task.task14.task1408;

/**
 * Created by Admin on 1/7/2018.
 */

    public class RussianHen extends Hen implements Country {
        int getCountOfEggsPerMonth() {
            return 12;
        }

    String getDescription() {
        return super.getDescription() + " Моя страна - " + RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
    }