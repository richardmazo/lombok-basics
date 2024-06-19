package com.devs4j.lombokspring.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
public class Employee {

    private Integer id;
    private String firstName;
    private String lastName;
    private String middleName;
    private String nickname;
    private float salary;
    private EmployeeType type;

    @Singular
    private List<String> addresses;

    @Builder.Default
    private LocalDateTime lastUpdateTs = LocalDateTime.now();
    @Builder.Default
    private LocalDateTime createTs = LocalDateTime.now();
}
