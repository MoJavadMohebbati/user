package com.user.user.service;

import com.user.user.model.User;
import com.user.user.repository.IUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService implements IUserService{

    private final IUserRepository iUserRepository;
    @Override
    public Long save(User user) {
        return iUserRepository.save(user).getId();
    }

    @Override
    public List<User> findByName(String name) {
        return iUserRepository.findByNameEquals(name);
    }

    @Override
    public Optional<User> findById(Long id) {
        return iUserRepository.findById(id);
    }
}
