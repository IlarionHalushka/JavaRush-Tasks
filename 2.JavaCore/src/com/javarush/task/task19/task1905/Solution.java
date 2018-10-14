package com.javarush.task.task19.task1905;

import sun.util.resources.cldr.chr.CalendarData_chr_US;

import java.util.HashMap;
import java.util.Map;

/* 
Закрепляем адаптер
*/

public class Solution {
    public static Map<String,String> countries = new HashMap<String,String>();
    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {
      /*  String sFirst = "+38(050)123-45-67";
        sFirst = sFirst.replaceAll("(.{1})(\\d{2})(.{1})(\\d{3})(.{1})(\\d{3})(.{1})(\\d{2})(.{1})(\\d{2})", "$1$2$4$6$8$10");
        System.out.println(sFirst);*/



    }

    public static class DataAdapter implements RowItem {
        private Customer customer;
        private Contact contact;
        public DataAdapter(Customer customer, Contact contact) {
            this.contact = contact;
            this.customer = customer;
        }

        public String getCountryCode() {
            for (Map.Entry<String, String> entry : countries.entrySet()) {
                if (entry.getValue().equals(customer.getCountryName())) {
                    return entry.getKey();
                }
            }
            return null;
        };        //example UA

        public String getCompany() {
            return customer.getCompanyName();
        };            //example JavaRush Ltd.

        public String getContactFirstName() {
            return contact.getName().split(", ")[1];
        };   //example Ivan

        public String getContactLastName() {
            return contact.getName().split(", ")[0];
        };    //example Ivanov

        public String getDialString() {
            return "callto://" + contact.getPhoneNumber().replaceAll("[^+0-9]", "");
        };         //example callto://+380501234567

    }

    public static interface RowItem {
        String getCountryCode();        //example UA
        String getCompany();            //example JavaRush Ltd.
        String getContactFirstName();   //example Ivan
        String getContactLastName();    //example Ivanov
        String getDialString();         //example callto://+380501234567
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