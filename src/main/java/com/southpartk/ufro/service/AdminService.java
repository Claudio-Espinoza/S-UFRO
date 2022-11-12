package com.southpartk.ufro.service;

import com.southpartk.ufro.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    AdminRepository adminRepository;

    public String existsById(String rut, String password) {
        if(adminRepository.existsById(rut)){
            return validationId(rut, password);
        }else{
            return "redirect:/accreditAdmin";
        }
    }


    public String validationId(String rut, String password) {
        var admin = adminRepository.findById(rut);
        var passwordIdenty= admin.get().getPassword();
        if(passwordIdenty.equals(password)){
            return  "redirect:/adminShowMenu";
        }else {
            return "redirect:/accreditAdmin";
        }
    }




}
