package com.southpartk.ufro.service;

import com.southpartk.ufro.model.Admin;
import com.southpartk.ufro.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User save(User user);
    //-|Ver y validar el dato|-//
    Optional<User> get(String id);
    //-|Actualizar|------------//
    List<User> findByAll();

}
