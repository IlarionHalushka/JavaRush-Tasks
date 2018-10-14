package com.javarush.task.task05.task0514;

/* 
Программист создает человека
*/

public class Solution {


    /*Создать class Person. У человека должно быть имя String name, возраст int age.
    Добавь метод initialize(String name, int age), в котором проинициализируй переменные name и age.
    В методе main создай объект Person, занеси его ссылку в переменную person.
    Вызови метод initialize с любыми значениями.
    */



    public static void main(String[] args) {
        Person person = new Person();
        person.initialize("Vasya", 1);
        //напишите тут ваш код
    }

    static class Person {
        String name;
        int age;

        public void initialize(String name, int age) {
            this.name = name;
            this.age = age;
        }
        //напишите тут ваш код
    }
}
