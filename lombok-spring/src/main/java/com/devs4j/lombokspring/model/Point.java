package com.devs4j.lombokspring.model;

import lombok.AllArgsConstructor;
import lombok.ToString;
import lombok.With;

@AllArgsConstructor
@ToString
public class Point {

    @With
    private final float x;
    @With
    private final float y;

}
