package com.walking.lesson20_exceptions.task1_catchException.service;

import com.walking.lesson20_exceptions.task1_catchException.model.File;

import java.io.FileNotFoundException;

public class SearchService {

    private File[] fileStorage;

    public SearchService(File[] fileStorage) {
        this.fileStorage = fileStorage;
    }

    public void search(String filename) throws FileNotFoundException {
        if (filename != null) {
            boolean flag = false;

            for (File file : fileStorage) {
                if (file.getFilename().equals(filename)) {
                    flag = true;
                    System.out.println(file);
                }
            }

            if (!flag) {
                throw new FileNotFoundException("File with filename \"" + filename + "\" not found");
            }

        } else {
            throw new FileNotFoundException("Filename couldn't be null");
        }
    }
}
