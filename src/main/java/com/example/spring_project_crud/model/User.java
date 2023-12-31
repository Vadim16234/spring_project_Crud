package com.example.spring_project_crud.model;

import lombok.Data;

@Data
public class User {

    private Long id;
    private String name;

    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
