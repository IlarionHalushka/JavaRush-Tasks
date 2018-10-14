package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age;
        private String lastname;
        private int weight;
        private int height;
        private int strength;

        public Human(String name, int age, String lastname, int weight, int height, int strength){
            this.name = name;
            this.age = age;
            this.lastname = lastname;
            this.weight = weight;
            this.height = height;
            this.strength = strength;
        }

        public Human(String name, int age, String lastname, int weight, int height){
            this.name = name;
            this.age = age;
            this.lastname = lastname;
            this.weight = weight;
            this.height = height;
        }

        public Human(String name, int age, String lastname, int weight){
            this.name = name;
            this.age = age;
            this.lastname = lastname;
            this.weight = weight;
        }

        public Human(String name, int age, String lastname){
            this.name = name;
            this.age = age;
            this.lastname = lastname;
        }

        public Human(String name, int age){
            this.name = name;
            this.age = age;
        }

        public Human(String name){
            this.name = name;
        }

        public Human(int age){
            this.age = age;
        }

        public Human(int age, String name){
            this.name = name;
            this.age = age;
        }

        public Human(String name, String lastname){
            this.name = name;
            this.lastname = lastname;
        }

        public Human(int age, int weight){
            this.weight = weight;
            this.age = age;
        }
        // напишите тут ваши переменные и конструкторы
    }
}
