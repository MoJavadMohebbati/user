package com.user.user.service;

import com.user.user.model.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    Long save(User user);
    List<User> findByName(String name);

    Optional<User> findById(Long id);

}
