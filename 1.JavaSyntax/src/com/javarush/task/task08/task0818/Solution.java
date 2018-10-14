package com.javarush.task.task08.task0818;

import java.security.KeyStore;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("1",300);
        map.put("2",400);
        map.put("3",500);
        map.put("4",600);
        map.put("5",700);
        map.put("6",800);
        map.put("7",900);
        map.put("8",100);
        map.put("9",330);
        map.put("0",3000);
        return map;
        //напишите тут ваш код
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        HashMap<String,Integer> copymap = new HashMap<>(map);

        Iterator <HashMap.Entry<String, Integer>> iterator = copymap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> pair = iterator.next();
            if (pair.getValue() < 500)
                map.remove(pair.getKey());
        }

        //напишите тут ваш код
    }

    public static void main(String[] args) {
    }
}