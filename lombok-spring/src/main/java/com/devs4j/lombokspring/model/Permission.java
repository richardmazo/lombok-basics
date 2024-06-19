package com.devs4j.lombokspring.model;

import lombok.Value;

import java.time.LocalDateTime;

@Value
public class Permission {
    private int id;
    private String name;
    private LocalDateTime createTs;
}
