package com.javarush.task.task13.task1307;

/* 
Параметризованый интерфейс
*/

import java.text.SimpleDateFormat;

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }
// В классе StringObject реализуй интерфейс SimpleObject с параметром типа String.


    class StringObject implements SimpleObject<String> //допишите здесь ваш код
    {
        public SimpleObject<String> getInstance() {
            return null;
        };
    }
}