package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

import java.awt.*;

/**
 * Created by Admin on 1/16/2018.
 */
public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes type) {
        if (ImageTypes.BMP.equals(type)) {
            return new BmpReader();
        } else if (ImageTypes.JPG.equals(type)) {
            return new JpgReader();
        } else if (ImageTypes.PNG.equals(type)) {
            return new PngReader();
        } else {
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }
    }
}
