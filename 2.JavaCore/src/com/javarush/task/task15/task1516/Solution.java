package com.javarush.task.task15.task1516;

/* 
Значения по умолчанию
*/

public class Solution {
    public int intVar;
    public double doubleVar;
    public Double DoubleVar;
    public boolean booleanVar;
    public Object ObjectVar;
    public Exception ExceptionVar;
    public String StringVar;

    public static void main(String[] args) {
        Solution one = new Solution();
        System.out.println(one.intVar);
        System.out.println(one.doubleVar);
        System.out.println(one.DoubleVar);
        System.out.println(one.booleanVar);
        System.out.println(one.ObjectVar);
        System.out.println(one.ExceptionVar);
        System.out.println(one.StringVar);
    }
}
