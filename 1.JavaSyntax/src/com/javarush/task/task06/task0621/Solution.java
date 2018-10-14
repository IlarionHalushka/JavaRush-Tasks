package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {

/*    Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама.
    Изменить класс Cat так, чтобы он мог описать данную ситуацию.
            Создать 6 объектов: дедушку (папин папа), бабушку (мамина мама), папу, маму, сына, дочь.
    Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.*/

  /*  Пример ввода:
    дедушка Вася
    бабушка Мурка
    папа Котофей
    мама Василиса
    сын Мурчик
    дочь Пушинка

    Пример вывода:
    Cat name is дедушка Вася, no mother, no father
    Cat name is бабушка Мурка, no mother, no father
    Cat name is папа Котофей, no mother, father is дедушка Вася*/

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandpaName = reader.readLine();
        Cat catGrandpa = new Cat(grandpaName);

        String grandmaName = reader.readLine();
        Cat catGrandma = new Cat(grandmaName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, null, catGrandpa);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrandma, null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(catGrandpa);
        System.out.println(catGrandma);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        @Override
        public String toString() {
            if (mother == null & father == null)
                return "Cat name is " + name + ", no mother, no father";
            else if (mother != null & father != null)
                return "Cat name is " + name + ", mother is " + mother.name + ", father is " + father.name;
            else if (father != null & mother == null)
                return "Cat name is " + name + ", no mother," + ", father is " + father.name;
            else if (father == null & mother != null)
                return "Cat name is " + name + ", mother is " + mother.name + ", no father";
            return "0";
        }
    }
}
