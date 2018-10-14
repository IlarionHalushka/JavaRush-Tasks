package com.javarush.task.task15.task1527;

import org.omg.CORBA.NameValuePair;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.URIParameter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException, URISyntaxException{
        // read url from console
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        URI url = new URI( br.readLine() );
        // get url query
        String query = url.getQuery();
        // get url parameters+values  (param=value)
        String[] paramsWithValues = query.split("&");

        String[][] params = new String[paramsWithValues.length][2];

        List<String> parameters = new ArrayList<>();
        List<String> values = new ArrayList<>();
        // fill out the lists parameters, values
        for (int i = 0; i < paramsWithValues.length; i ++) {
            params[i] = paramsWithValues[i].split("=");

            parameters.add(params[i][0]);
            if (paramsWithValues[i].contains("=")) {
                values.add(params[i][1]);
            }
            else {
                values.add(null);
            }
        }

        // print all parameters
        for (String parameter : parameters) {
            System.out.print(parameter + " ");
        }
        System.out.println();

        // if parameter equals "obj" call alert function on its value
        // if the value can be parsed to double call alert(Double double)
        // if the value cannot be parsed to double call alert(String string)
        for (String parameter : parameters) {
            if ("obj".equals(parameter)) {
                String objValue = values.get( parameters.indexOf(parameter) );

                try {
                    alert( Double.parseDouble(objValue) );
                } catch (Exception e) {
                    alert(objValue);
                }
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
