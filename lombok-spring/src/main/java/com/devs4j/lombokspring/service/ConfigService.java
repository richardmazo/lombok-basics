package com.devs4j.lombokspring.service;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConfigService {

    @Getter(lazy = true)
    private final String configuration = getConfigurationFromRetomeSource();

    private String getConfigurationFromRetomeSource() {
        log.info("Getting configuration from remote source");
        try {
            Thread.sleep(2000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Configuration from remote source";
    }

}
