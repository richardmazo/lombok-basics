package com.devs4j.lombokspring.service;

import com.devs4j.lombokspring.LombokSpringApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Closeable;
import java.io.IOException;

public class FileManager /*implements Closeable*/ {

    private static final Logger log = LoggerFactory.getLogger(FileManager.class);

    public void write(String texto, String file) {
        log.info("Writing {} in {}", texto, file);
    }

    //@Override
    public void close() throws IOException {
        log.info("Releasing resources");
    }
}
