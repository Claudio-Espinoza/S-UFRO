package com.southpartk.ufro.service;

import com.southpartk.ufro.model.Admin;
import com.southpartk.ufro.model.User;
import com.southpartk.ufro.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class UserServiceImplement implements UserService{
    @Autowired
    UserRepository userRepository;

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public Optional<User> get(String id) {
        return userRepository.findById(id);
    }
}
