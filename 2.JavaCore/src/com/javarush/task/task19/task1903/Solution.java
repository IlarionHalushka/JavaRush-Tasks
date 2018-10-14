package com.javarush.task.task19.task1903;

/* 
Адаптация нескольких интерфейсов
*/

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();
    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {
     /*   IncomeData incomeData = new IncomeData() {
            @Override
            public String getCountryCode() {
                return null;
            }

            @Override
            public String getCompany() {
                return null;
            }

            @Override
            public String getContactFirstName() {
                return null;
            }

            @Override
            public String getContactLastName() {
                return null;
            }

            @Override
            public int getCountryPhoneCode() {
                return 38;
            }

            @Override
            public int getPhoneNumber() {
                return 12345;
            }
        };
        IncomeDataAdapter incomeDataAdapter = new IncomeDataAdapter(incomeData);
        System.out.println(incomeDataAdapter.getPhoneNumber());*/
    }

    public static class IncomeDataAdapter implements Customer, Contact {
        private IncomeData data;

        IncomeDataAdapter(IncomeData data) {
            this.data = data;
        }

        public String getCompanyName() {
            return data.getCompany();
        };        //example JavaRush Ltd.

        public String getCountryName() {
            return countries.get(data.getCountryCode());
        };        //example Ukraine

        public String getName() {
            return data.getContactLastName() + ", " + data.getContactFirstName();
        };               //example Ivanov, Ivan

        public String getPhoneNumber() {
            int number = data.getPhoneNumber();
            StringBuilder numb = new StringBuilder(number + "");
            while (numb.length() < 10) {
                numb.insert(0, "0");
            }
            System.out.println(numb);
            String result =  "+" + data.getCountryPhoneCode() + "(" + numb.charAt(0) + numb.charAt(1) + numb.charAt(2) + ")"
                    + numb.charAt(3) + numb.charAt(4) + numb.charAt(5) + "-" + numb.charAt(6) + numb.charAt(7)
                    + "-" + numb.charAt(8) + numb.charAt(9);
            return result;
        };        //example +38(050)123-45-67

    }


    public static interface IncomeData {
        String getCountryCode();        //example UA

        String getCompany();            //example JavaRush Ltd.

        String getContactFirstName();   //example Ivan

        String getContactLastName();    //example Ivanov

        int getCountryPhoneCode();      //example 38

        int getPhoneNumber();           //example 501234567
    }

    public static interface Customer {
        String getCompanyName();        //example JavaRush Ltd.

        String getCountryName();        //example Ukraine
    }

    public static interface Contact {
        String getName();               //example Ivanov, Ivan

        String getPhoneNumber();        //example +38(050)123-45-67
    }
}