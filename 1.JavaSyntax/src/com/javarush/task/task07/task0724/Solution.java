package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {

  /*  Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
    Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.

    Примечание:
    Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.

    Пример вывода:
    Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
    Имя: Катя, пол: женский, возраст: 55
    Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня*/

    public static void main(String[] args) {
        Human ded1 = new Human("ded1", true, 22);
        Human ded2 = new Human("ded2", true, 23);
        Human baba1 = new Human("baba1", true, 23);
        Human baba2 = new Human("baba2", true, 23);
        Human father = new Human("father", true, 23, ded1, baba1);
        Human mother = new Human("father", true, 23, ded2, baba2);
        Human child1 = new Human("child1", true, 23, father, mother);
        Human child2 = new Human("child2", true, 23, father, mother);
        Human child3 = new Human("child3", true, 23, father, mother);

        System.out.println(ded1);
        System.out.println(ded2);
        System.out.println(baba1);
        System.out.println(baba2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
        //напишите тут ваш код
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;
        //напишите тут ваш код
        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }
        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















