package com.walking.lesson20_exceptions.task1_catchException.service;

import com.walking.lesson20_exceptions.task1_catchException.enums.InformationType;
import com.walking.lesson20_exceptions.task1_catchException.model.File;

public class FileGenerator {

    public static File[] generate() {
        return new File[]{
                new File("cv.pdf", 10.0, InformationType.TEXT),
                new File("main.pdf", 100.5, InformationType.TEXT),
                new File("cv.psd", 40.3, InformationType.IMAGE),
                new File("icon.jpeg", 35.7, InformationType.TEXT),
                new File("movie.mov", 1000.5, InformationType.VIDEO),
                new File("50cent.mp3", 100.0, InformationType.AUDIO),
                new File("background-2.png", 10.0, InformationType.IMAGE),
                new File("background-3.png", 10.0, InformationType.IMAGE),
                new File("background-4.png", 10.0, InformationType.IMAGE),
        };
    }
}
