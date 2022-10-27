package com.southpartk.ufro.service;

import com.southpartk.ufro.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    AdminRepository adminRepository;

    public boolean existsById(String rut) {
        return adminRepository.existsById(rut);
    }

    public boolean validationId(String rut) {
        var admin = adminRepository.findById(rut);
        var passwordIdenty= admin.get().getPassword();
        if(passwordIdenty == 1234){
            return true;
        }else{
            return false;
        }

    }


}
