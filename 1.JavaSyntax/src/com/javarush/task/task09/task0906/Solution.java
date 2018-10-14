package com.javarush.task.task09.task0906;

/* 
Логирование стек трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        // com.javarush.task.task09.task0906.Solution: main: In main method
        //напишите тут ваш код

        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();

     /*   for (StackTraceElement element : stackTraceElements)
        {
            System.out.println(element.getMethodName());
            System.out.println(element.getClassName());
            System.out.println(element.getLineNumber());
        }*/


           System.out.println(stackTraceElements[2].getClassName() + ": " + stackTraceElements[2].getMethodName() + ": " + s);

    }
}
