package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        HashMap<String, Cat> catsMap = new HashMap<>();
        catsMap.put("first", new Cat("first"));
        catsMap.put("2", new Cat("2"));
        catsMap.put("3", new Cat("3"));
        catsMap.put("4", new Cat("4"));
        catsMap.put("5", new Cat("5"));
        catsMap.put("6", new Cat("6"));
        catsMap.put("7", new Cat("7"));
        catsMap.put("8", new Cat("8"));
        catsMap.put("9", new Cat("9"));
        catsMap.put("0", new Cat("0"));
        return catsMap;
        //напишите тут ваш код
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> catsSet = new HashSet<>();

        for (Map.Entry<String, Cat> entry : map.entrySet()) {
            catsSet.add(entry.getValue());
        }

        return catsSet;
        //напишите тут ваш код
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
