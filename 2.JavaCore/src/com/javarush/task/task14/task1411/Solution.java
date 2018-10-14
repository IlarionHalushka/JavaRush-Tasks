package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key;

        while (true) {
            key = reader.readLine();
            if (!key.equals("user") && !key.equals("loser") && !key.equals("coder") && !key.equals("proger")) {
                break;
            }
            if (key.equals("user")) {
                person = new Person.User();
            }
            if (key.equals("loser")) {
                person = new Person.Loser();
            }
            if (key.equals("coder")) {
                person = new Person.Coder();
            }
            if (key.equals("proger")) {
                person = new Person.Proger();
            }
            doWork(person);
        }
    }

    public static void doWork(Person person) {
        if (person instanceof Person.User) {
            ((Person.User) person).live();
        }
        if (person instanceof Person.Loser) {
            ((Person.Loser) person).doNothing();
        }
        if (person instanceof Person.Coder) {
            ((Person.Coder) person).coding();
        }
        if (person instanceof Person.Proger) {
            ((Person.Proger) person).enjoy();
        }
        // пункт 3
    }
}
