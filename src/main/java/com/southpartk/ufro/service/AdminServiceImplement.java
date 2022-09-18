package com.southpartk.ufro.service;

import com.southpartk.ufro.model.Admin;
import com.southpartk.ufro.model.User;
import com.southpartk.ufro.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class AdminServiceImplement implements AdminService {
    @Autowired
    private AdminRepository adminRepository; //Llamar a la entidad con sus funcionalidades de JPA

    @Override
    public Optional<Admin> get(String id) {
        return Optional.empty();
    }
}
