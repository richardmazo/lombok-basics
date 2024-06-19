package com.devs4j.lombokspring.files;

import lombok.SneakyThrows;

import java.io.File;
import java.io.IOException;

public class FileManager2 {

    public static void createFiles(String ...files){
        for (String file : files){
            createFile(file);
        }
    }

    @SneakyThrows
    public static void createFile(String file) {
        File f = new File(file);
        f.createNewFile();
    }

}
