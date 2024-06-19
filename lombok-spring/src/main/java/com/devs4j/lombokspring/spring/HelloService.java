package com.devs4j.lombokspring.spring;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//@AllArgsConstructor
@RequiredArgsConstructor
public class HelloService {

    /*@Autowired
    private PrintService printService;*/

    private final PrintService printService;

    private String prefix="HELLO MESSAGE";

    public void sayHello(){
        printService.printMessage(String.format("%s - %s", prefix, "Hello from Hello service"));
    }

}
