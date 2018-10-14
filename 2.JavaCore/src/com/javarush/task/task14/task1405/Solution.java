package com.javarush.task.task14.task1405;

/* 
Food
*/

public class Solution {
    public static void main(String[] args) {
        Food food = new Food();
        Selectable selectable = new Food();
        Food newFood = (Food) selectable;

        foodMethods(food);
        selectableMethods(selectable);
    }

   /* 1. Реализовать интерфейс Selectable в классе Food.
            2. Метод onSelect() должен выводить на экран фразу "food was selected".
            3. Подумай, какие методы можно вызвать для переменной food и какие для selectable.
    4. В методе foodMethods вызови методы onSelect, eat, если это возможно.
            5. В методе selectableMethods вызови методы onSelect, eat, если это возможно.
            6. Явное приведение типов не использовать.*/

    public static void foodMethods(Food food) {
        food.onSelect();
        food.eat();
        //тут добавьте вызов методов для переменной food
    }

    public static void selectableMethods(Selectable selectable) {
        selectable.onSelect();
        //тут добавьте вызов методов для переменной selectable
    }

    interface Selectable {
        void onSelect();
    }

    static class Food implements Selectable {
        public void eat() {
            System.out.println("food was eaten");
        }
        public void onSelect() {
            System.out.println("food was selected");
        }
    }
}
