package com.example.spring_project_crud.rest;

import com.example.spring_project_crud.model.User;
import com.example.spring_project_crud.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/user")
public class UserRestController {

    private final UserRepo userRepo;

    @GetMapping("/all")
    public List<User>getAll(){
        return userRepo.getAllUsers();
    }

    @PostMapping
    public boolean addUser(@RequestBody User user) {
        userRepo.addUser(user);
        return true;
    }
}
