package com.devs4j.lombokspring.model;

import com.devs4j.lombokspring.LombokSpringApplication;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Person {

    private static final Logger log = LoggerFactory.getLogger(Person.class);

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String lastName;

    @Getter
    @Setter
    private boolean alive;

    @Getter(value = AccessLevel.PRIVATE)
    @Setter(value = AccessLevel.PRIVATE)
    private String nickname;



    public void foo(){
        setNickname("Juanito");
        String nickname = getNickname();
        log.info("Nickname {}", nickname);
    }


}
