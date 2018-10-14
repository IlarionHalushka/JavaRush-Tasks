package com.javarush.task.task13.task1325;

import java.awt.*;

/* 
Компиляция программы
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Fox bigFox = new BigFox();
        System.out.println(bigFox.getName());
        System.out.println(bigFox.getColor());
    }

   /* 1. Исправь классы Fox и BigFox так, чтобы программа компилировалась.
    Задача не предполагает создания экземпляров базового класса.
    2. Метод main менять нельзя.*/

    public interface Animal {
        Color getColor();
    }

    public abstract static class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }

    public static class BigFox extends Fox {
        public Color getColor() {return new Color(200);}
    }

}
