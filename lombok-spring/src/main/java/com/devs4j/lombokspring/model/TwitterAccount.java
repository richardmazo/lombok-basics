package com.devs4j.lombokspring.model;

import lombok.NonNull;

public class TwitterAccount {

    private String username;

    public TwitterAccount(@NonNull String username) {//Con @NonNull se asegura que el valor no sea nulo
        super();
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
