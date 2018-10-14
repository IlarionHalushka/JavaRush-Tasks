package com.javarush.task.task16.task1630;

import java.io.*;
import java.util.*;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    static {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
             firstFileName = br.readLine();
             secondFileName = br.readLine();
        } catch (IOException e) {
        }
    }
    //add your code here - добавьте код тут

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        //add your code here - добавьте код тут
        System.out.println(f.getFileContent());
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        private String fullFileName;
        private String fileContent = "";

        public void setFileName(String fullFileName) {
            this.fullFileName = fullFileName;
        };

        public String getFileContent() {
           return this.fileContent;
        };

        public void start() {
            run();
        };

        public void run() {
            String line;

            try {
                BufferedReader scanner = new BufferedReader(new InputStreamReader(new FileInputStream(this.fullFileName)));
                while ( !(line = scanner.readLine()).isEmpty()  ) {
                    fileContent += line + " ";
                }
                scanner.close();
            } catch (Exception e) {
            }
        }
    }

    public interface ReadFileInterface extends Runnable {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут
}
