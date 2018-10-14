package com.javarush.task.task14.task1408;

/**
 * Created by Admin on 1/7/2018.
 */

    public class MoldovanHen extends Hen implements Country {
        int getCountOfEggsPerMonth() {
            return 13;
        }

    String getDescription() {
        return super.getDescription() + " Моя страна - " + MOLDOVA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
    }