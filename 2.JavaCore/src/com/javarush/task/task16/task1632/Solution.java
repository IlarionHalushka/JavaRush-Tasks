package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());
    }

    public static void main(String[] args) throws InterruptedException {
     /*   Thread4 tr4 = new Thread4();
        tr4.start();
        Thread.sleep(100);
        tr4.showWarning();
        System.out.println(tr4.isAlive());*/
    }

    public static class Thread1 extends Thread {
        public void run() {
            while (true) {
            }
        }
    }

    public static class Thread2 extends Thread {
        public void run() {
            while (true) {
                if (Thread.currentThread().isInterrupted()) {
                    System.out.println("InterruptedException");
                }
            }
        }
    }

    public static class Thread3 extends Thread {
        public void run() {
            while (true) {
                System.out.println("Ура");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }

    }

    public static class Thread4 extends Thread  implements Message {
        private boolean interrupted = false;

        public void run() {
            while (!interrupted) {
            }
        }

        public void showWarning() {
            interrupted = true;
        }
    }

    public static class Thread5 extends Thread {
        public void run() {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try {
                String line = br.readLine();
                int sum = 0;

                while (!"N".equals(line)) {
                    sum += Integer.parseInt(line);
                    line = br.readLine();
                }

                System.out.println(sum);
            } catch (IOException e) {
            }
        }
    }
}