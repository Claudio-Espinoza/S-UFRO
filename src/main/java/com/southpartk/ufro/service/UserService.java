package com.southpartk.ufro.service;

import com.southpartk.ufro.model.Admin;
import com.southpartk.ufro.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    //-|Guardar|-//
    User save(User user);
    //-|Ver|-//
    List<User> findByAll();

    void deleteUser(String nombre);
}
