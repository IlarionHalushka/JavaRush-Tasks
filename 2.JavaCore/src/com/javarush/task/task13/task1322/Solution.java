package com.javarush.task.task13.task1322;

/* 
Интерфейс SimpleObject
*/

import java.text.SimpleDateFormat;

public class Solution {
    public static void main(String[] args) throws Exception {
        SimpleObject<String> stringObject = new StringObject<String>();
    }

/*    1. Создай класс StringObject.
    2. В классе StringObject реализуй интерфейс SimpleObject с параметром типа String.
            3. Программа должна компилироваться.*/

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    static class StringObject<String> implements SimpleObject {
        public SimpleObject<String> getInstance() {
            return null;
        }
    }

}
