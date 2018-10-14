package com.javarush.task.task13.task1315;

/* 
Том, Джерри и Спайк
*/

public class Solution {
    public static void main(String[] args) {

    }

 /*   1. Создай классы Dog, Cat и Mouse.
    2. Реализуй интерфейсы в добавленных классах, учитывая что:
            - Кот(Cat) может передвигаться, может кого-то съесть и может быть сам съеден.
    - Мышь(Mouse) может передвигаться и может быть съедена.
            - Собака(Dog) может передвигаться и съесть кого-то.*/


    //может двигаться
    public interface Movable {
        void move();
    }

    //может быть съеден
    public interface Eatable {
        void eaten();
    }

    //может кого-нибудь съесть
    public interface Eat {
        void eat();
    }

    class Cat implements Movable, Eatable, Eat{
        public void move() {};
        public void eat() {};
        public void eaten() {};

    }
    class Dog implements Movable, Eat{
        public void move() {};
        public void eat() {};

    }
    class Mouse implements Movable, Eatable{
        public void move() {};
        public void eaten() {};
    }
}