package com.javarush.task.task12.task1226;

/* 
Лазать, летать и бегать
*/

public class Solution {

 /*   1. Внутри класса Solution создай интерфейс public interface Fly(летать) с методом void fly().
            2. Внутри класса Solution создай интерфейс public interface Climb(лазить по деревьям) с методом void climb().
            3. Внутри класса Solution создай интерфейс public interface Run(бегать) с методом void run().
            4. Подумай логически, какие именно интерфейсы нужно добавить для каждого класса.
    5. Добавь интерфейсы классам Cat(кот), Dog(собака), Tiger(тигр), Duck(Утка).*/

    public static void main(String[] args) {

    }

    public interface Fly {
        void fly();
    }

    public interface Climb {
        void climb();
    }

    public interface Run {
        void run();
    }

    public class Cat implements Climb, Run{
        public void climb() {};
        public void run() {};
    }

    public class Dog implements Run{
        public void run() {};
    }

    public class Tiger extends Cat {
    }

    public class Duck implements Run, Fly{
        public void run() {};
        public void fly() {};

    }
}
