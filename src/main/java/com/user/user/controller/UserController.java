package com.user.user.controller;

import com.user.user.model.User;
import com.user.user.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/user")
@RequiredArgsConstructor
public class UserController {
    private final IUserService iUserService;

    @PostMapping(value = "/save")
    public Long save(@RequestBody User user) {
        return iUserService.save(user);
    }

    @GetMapping(value = "by-id/{id}")
    public Optional<User>loadById(@PathVariable Long id) {
        return iUserService.findById(id);
    }

    @GetMapping(value = "by-name/{name}")
    public List<User> loadByName(@PathVariable String name) {
        return iUserService.findByName(name);
    }
}
