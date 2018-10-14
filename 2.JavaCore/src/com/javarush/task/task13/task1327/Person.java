package com.javarush.task.task13.task1327;

public class Person implements RepkaItem {
    private String name;
    private String namePadezh;

 /*   Сказка Репка:
            1. Реализовать интерфейс RepkaItem в классе Person.
            2. В классе Person реализовать метод pull(Person person), который выводит фразу типа '<name> за <person>'.*/

    public Person(String name, String namePadezh) {
        this.name = name;
        this.namePadezh = namePadezh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamePadezh() {
        return namePadezh;
    }

    public void setNamePadezh(String namePadezh) {
        this.namePadezh = namePadezh;
    }

    public void pull(Person person) {
        System.out.println(name + " за " + person.getNamePadezh());
    }
}
