package com.devs4j.lombokspring.model;

import lombok.*;

@ToString(onlyExplicitlyIncluded = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class User {

    @Getter
    @Setter
    @ToString.Include
    @EqualsAndHashCode.Include
    private Integer id;

    @Getter
    @Setter
    @ToString.Include
    @EqualsAndHashCode.Include
    @NonNull
    private String username;

    @Getter
    @Setter
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @NonNull
    private String password;

    @Getter
    @Setter
    @EqualsAndHashCode.Exclude
    private String role;



}
