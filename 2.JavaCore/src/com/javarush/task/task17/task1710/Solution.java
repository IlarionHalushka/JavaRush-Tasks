package com.javarush.task.task17.task1710;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }
  /*  -c name sex bd
     -u id name sex bd
     -d id
     -i id*/

    public static void main(String[] args) throws IOException, ParseException {
       // String parameters = br.readLine();
       // String parameters = args[0];

        String[] parametersArray = args;
                //parameters.split(" ");

        if ("-c".equals(parametersArray[0])) {
            if ("м".equals(parametersArray[2])) {
                Person newMan = Person.createMale(parametersArray[1], new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(parametersArray[3]));
                allPeople.add(newMan);
                System.out.println(allPeople.indexOf(newMan));
            }
            if ("ж".equals(parametersArray[2])) {
                Person newWoman = Person.createFemale(parametersArray[1], new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(parametersArray[3]));
                allPeople.add(newWoman);
                System.out.println(allPeople.indexOf(newWoman));
            }
        }

        if ("-u".equals(parametersArray[0])) {
            allPeople.get(Integer.parseInt(args[1])).setName(parametersArray[2]);

            if ("ж".equals(parametersArray[3])) {
                allPeople.get(Integer.parseInt(args[1])).setSex(Sex.FEMALE);
            }
            if ("м".equals(parametersArray[3])) {
                allPeople.get(Integer.parseInt(args[1])).setSex(Sex.MALE);
            }

            allPeople.get(Integer.parseInt(args[1])).setBirthDay(new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(parametersArray[4]));
        }

        if ("-d".equals(parametersArray[0])) {
            for (int i = 0; i < allPeople.size(); i++) {
                if (i == Integer.parseInt(parametersArray[1])) {
                    allPeople.get(i).setBirthDay(null);
                    allPeople.get(i).setName(null);
                    allPeople.get(i).setSex(null);
                }
            }
        }

        if ("-i".equals(parametersArray[0])) {
            for (int i = 0; i < allPeople.size(); i++) {
                if (i == Integer.parseInt(parametersArray[1])) {
                    System.out.print(allPeople.get(i).getName() + " ");

                    String sex = allPeople.get(i).getSex().toString();

                    if  ("MALE".equals(sex)) {
                        System.out.print("м ");
                    } else if ("FEMALE".equals(sex)) {
                        System.out.print("ж ");
                    }

                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                    String formatted = dateFormat.format(allPeople.get(i).getBirthDay());
                    System.out.println(formatted);

                }
            }
        }
    }
}
