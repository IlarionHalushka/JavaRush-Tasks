package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        switch (args[0]) {
            case "-c": synchronized (allPeople){
                for (int i = 0; i < args.length - 1; i += 3) {
                    if ("м".equals(args[i + 2])) {
                        Person newMan = Person.createMale(args[i + 1], new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[i+ 3]));
                        allPeople.add(newMan);
                        System.out.println(allPeople.indexOf(newMan));
                    }
                    if ("ж".equals(args[i + 2])) {
                        Person newWoman = Person.createFemale(args[i + 1], new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[i + 3]));
                        allPeople.add(newWoman);
                        System.out.println(allPeople.indexOf(newWoman));
                    }
                }
                break;
            }
            case "-u": synchronized (allPeople) {
                for (int i = 0; i < args.length - 1; i += 4) {
                    allPeople.get(Integer.parseInt(args[i + 1])).setName(args[i + 2]);

                    if ("ж".equals(args[i + 3])) {
                        allPeople.get(Integer.parseInt(args[i + 1])).setSex(Sex.FEMALE);
                    }
                    if ("м".equals(args[i + 3])) {
                        allPeople.get(Integer.parseInt(args[i + 1])).setSex(Sex.MALE);
                    }

                    allPeople.get(Integer.parseInt(args[i + 1])).setBirthDay(new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[i + 4]));
                }
                break;
            }
            case "-d": synchronized (allPeople) {
                for (int i = 0; i < args.length - 1; i++) {
                    for (int j = 0; j < allPeople.size(); j++) {
                        if (j == Integer.parseInt(args[i + 1])) {
                            allPeople.get(j).setBirthDay(null);
                            allPeople.get(j).setName(null);
                            allPeople.get(j).setSex(null);
                        }
                    }
                }
                break;
            }
            case "-i": synchronized (allPeople) {
                for (int i = 1; i < args.length; i++) {

                    for (int j = 0; j < allPeople.size(); j++) {
                        if (j == Integer.parseInt(args[i])) {
                            System.out.print(allPeople.get(j).getName() + " ");

                            String sex = allPeople.get(j).getSex().toString();

                            if ("MALE".equals(sex)) {
                                System.out.print("м ");
                            } else if ("FEMALE".equals(sex)) {
                                System.out.print("ж ");
                            }

                            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                            String formatted = dateFormat.format(allPeople.get(j).getBirthDay());
                            System.out.println(formatted);

                        }
                    }
                }
                break;
            }
        }

       /*  for (int i = 0 ; i < allPeople.size(); i++) {
             System.out.println(allPeople.get(i).getName() + allPeople.get(i).getBirthDay() + allPeople.get(i).getSex());
        }*/
    }
}
