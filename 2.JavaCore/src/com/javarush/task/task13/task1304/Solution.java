package com.javarush.task.task13.task1304;

/* 
Selectable и Updatable
*/

import com.sun.org.apache.bcel.internal.generic.Select;

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable {
        void refresh();
    }

    class Screen implements Selectable, Updatable{
        public void refresh() {};
        public void onSelect() {};


    }

    //напишите тут ваш класс
}
