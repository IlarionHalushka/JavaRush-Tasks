package com.javarush.task.task14.task1408;

import java.util.Collections;

/**
 * Created by Admin on 1/7/2018.
 */

public class BelarusianHen extends Hen implements Country{
    int getCountOfEggsPerMonth() {
        return 14;
    }

    String getDescription() {
        return super.getDescription() + " Моя страна - " + BELARUS + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
