package com.javarush.task.task19.task1902;

/* 
Адаптер
*/

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class AdapterFileOutputStream implements AmigoStringWriter {
    private FileOutputStream fileOutputStream;

    AdapterFileOutputStream(FileOutputStream fileOutputStream) {
        this.fileOutputStream = fileOutputStream;
    }

    public void writeString(String s) throws IOException {
        fileOutputStream.write(s.getBytes());
    }

    public void flush() throws IOException {
        fileOutputStream.flush();
    }

    public void close() throws IOException {
        fileOutputStream.close();
    }

    public static void main(String[] args) {

    }


}

