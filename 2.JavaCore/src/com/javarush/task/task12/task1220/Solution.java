package com.javarush.task.task12.task1220;

/* 
Класс Human и интерфейсы Run, Swim
*/

public class Solution {
    public static void main(String[] args) {

    }


/*    Напиши public класс Human(человек) и public интерфейсы Run(бежать/ездить), Swim(плавать).
    Добавь в каждый интерфейс по одному методу.
    Добавь эти интерфейсы классу Human, но не реализуй методы.
    Объяви класс Human абстрактным.*/

    public abstract class Human implements Run, Swim {

    }

    public interface Run {
        void run();
    }

    public interface Swim {
        void swim();
    }
    //add public interfaces and public class here - добавь public интерфейсы и public класс тут
}
