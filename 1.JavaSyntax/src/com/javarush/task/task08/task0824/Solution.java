package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Human kid1 = new Human("kid1", true, 12);
        Human kid2 = new Human("kid2", false, 13);
        Human kid3 = new Human("kid3", true, 14);

        ArrayList<Human> kids = new ArrayList<>();
        kids.add(kid1);
        kids.add(kid2);
        kids.add(kid3);
        Human mother = new Human("mother", false, 23, kids);
        Human father = new Human("fahter", true, 22, kids);

        ArrayList<Human> ded1Children = new ArrayList<>();
        ded1Children.add(father);
        Human ded1 = new Human("ded1", true, 80, ded1Children);
        Human baba1 = new Human("baba1", false, 80, ded1Children);

        ArrayList<Human> ded2Children = new ArrayList<>();
        ded2Children.add(mother);
        Human ded2 = new Human("ded2", true, 80, ded2Children);
        Human baba2 = new Human("baba2", false, 80, ded2Children);

        System.out.println(ded1.toString()+ ded2.toString()+ baba1.toString()+ baba2.toString()+ father.toString()+ mother.toString()+ kid1.toString()+ kid2.toString()+ kid3.toString());

        //напишите тут ваш код
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human (String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public Human (String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        //напишите тут ваш код

        public String toString() throws NullPointerException{
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
