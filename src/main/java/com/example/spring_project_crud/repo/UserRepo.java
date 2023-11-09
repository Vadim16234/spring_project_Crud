package com.example.spring_project_crud.repo;

import com.example.spring_project_crud.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepo {
    private final List<User> userList = new ArrayList<>();

    {
        userList.add(new User(1L, "БорЩь"));
        userList.add(new User(2L, "Vadim"));
        userList.add(new User(3L, "Царь"));
        userList.add(new User(4L, "Я"));
    }

    public List<User> getAllUsers() {
        return userList;
    }

    public boolean addUser(User user) {
        userList.add(user);
        return true;
    }

}
