package com.devs4j.lombokspring.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode(callSuper = true)
public class UserEmployee extends User {

    @Getter
    @Setter
    @EqualsAndHashCode.Include
    private Integer employeeId;

    @Getter
    @Setter
    @EqualsAndHashCode.Exclude
    private EmployeeType type;


}
