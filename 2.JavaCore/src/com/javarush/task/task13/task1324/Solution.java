package com.javarush.task.task13.task1324;

import java.awt.*;

/* 
Один метод в классе
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

/*    Один метод в классе
    1. Унаследовать Fox от интерфейса Animal.
    2. Поменяй код так, чтобы в классе Fox был только один метод - getName.
    3. Методы удалять нельзя!*/


    public interface Animal {
        static Color getColor() {
            return new Color(3000);
        };

        static Integer getAge() { return 5;};
    }

    public static class Fox implements Animal {
       /* public Color getColor() {
            return new Color(1000);
        };*/

        public String getName() {
            return "Fox";
        }
    }
}
