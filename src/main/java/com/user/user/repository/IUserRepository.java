package com.user.user.repository;

import com.user.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IUserRepository extends JpaRepository<User,Long>{
    List<User>findByNameEquals(String name);

    User findByIdEquals(Long id);
}
