package com.javarush.task.task12.task1219;

/* 
Создаем человека
*/

public class Solution {
    public static void main(String[] args) {

    }

   /* Человек должен уметь бегать и плавать.
            5. Утка должна уметь летать, плавать и бегать.
            6. Пингвин должен уметь плавать и бегать.
            7. Самолет должен уметь летать и ездить.*/
    public interface Fly {
        public void fly();
    }

    public interface Run {
        public void run();
    }

    public interface Swim {
        public void swim();
    }


    public class Human implements Run, Swim {
        public void run() {};
        public void swim() {};
    }

    public class Duck implements Run, Fly, Swim{
        public void run() {};
        public void swim() {};
        public void fly() {};
    }

    public class Penguin implements Run, Swim{
        public void run() {};
        public void swim() {};
    }

    public class Airplane implements Fly, Run{
        public void run() {};
        public void fly() {};
    }
}
