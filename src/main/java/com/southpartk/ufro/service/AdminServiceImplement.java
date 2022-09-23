package com.southpartk.ufro.service;

import com.southpartk.ufro.model.Admin;
import com.southpartk.ufro.model.User;
import com.southpartk.ufro.repository.AdminRepository;
import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class AdminServiceImplement implements AdminService {
    @Autowired
    AdminRepository adminRepository;

    @Override
    public boolean existsById(String rut) {
        return adminRepository.existsById(rut);
    }

}
