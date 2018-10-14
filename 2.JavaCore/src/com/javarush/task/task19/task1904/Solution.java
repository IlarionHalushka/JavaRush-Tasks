package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {
      /*  Scanner scanner = new Scanner(System.in);
        PersonScannerAdapter personScannerAdapter = new PersonScannerAdapter(scanner);

        Person person = personScannerAdapter.read();
        System.out.println(person);*/

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner fileScanner;

        PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        public Person read() {
            String person = "";
            //fileScanner.useDelimiter(System.getProperty("line.separator"));
                person += fileScanner.nextLine();


            String[] personArray = person.split(" ");
            String name = personArray[1];
            String middleName = personArray[2];
            String lastName = personArray[0];
            String day = personArray[3];
            String month = personArray[4];
            String year = personArray[5];

            Calendar cal = Calendar.getInstance();
            cal.clear();
            cal.set(Calendar.YEAR, Integer.parseInt( year  ));
            cal.set(Calendar.MONTH, Integer.parseInt( month ) - 1);
            cal.set(Calendar.DATE, Integer.parseInt( day ));
            Date predefined = cal.getTime();

            return new Person(name, middleName, lastName, predefined);
        }

        public void close() {
            fileScanner.close();
        }
    }
}
