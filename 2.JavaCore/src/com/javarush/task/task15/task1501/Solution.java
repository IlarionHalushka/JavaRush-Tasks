package com.javarush.task.task15.task1501;

/* 
ООП - Расставить интерфейсы
*/

import sun.security.util.DisabledAlgorithmConstraints;

public class Solution {
    public static void main(String[] args) {

    }

    public interface Movable {
        boolean isMovable();
    }

    public interface Sellable {
        Object getAllowedAction(String name);
    }

    public interface Discountable {
        Object getAllowedAction();
    }

    public static class Clothes implements Movable, Discountable, Sellable{
        public boolean isMovable() { return true;};
        public Object getAllowedAction(String name) { return name;};
        public Object getAllowedAction() { return "10%";};


    }
}
