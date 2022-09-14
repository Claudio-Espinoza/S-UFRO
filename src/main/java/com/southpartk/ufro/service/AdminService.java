package com.southpartk.ufro.service;

import com.southpartk.ufro.model.Admin;

import java.util.Optional;

public interface AdminService {
    //-|Ver y validar el dato|-//
    Optional<Admin> get(String id);
    //-|Actualizar|------------//
    void update(Admin admin);
    //-|Borrar|----------------//
    void delete(String id);

}
