package com.southpartk.ufro.service;

import com.southpartk.ufro.model.User;
import com.southpartk.ufro.repository.AdminRepository;
import com.southpartk.ufro.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    private final AdminRepository adminRepository;

    private final UserRepository userRepository;

    public AdminService(AdminRepository adminRepository, UserRepository userRepository) {
        this.adminRepository = adminRepository;
        this.userRepository = userRepository;
    }

    public String existsById(String rut, String password) {
        if(adminRepository.existsById(rut)){
            return validationId(rut, password);
        }else{
            return "redirect:/credentialsAdmin";
        }
    }

    public String validationId(String rut, String password) {
        var admin = adminRepository.findById(rut);
        var passwordIdenty= admin.get().getPassword();
        if(passwordIdenty.equals(password)){
            return  "redirect:/adminShowMenu";
        }else {
            return "redirect:/credentialsAdmin";
        }
    }

    public Iterable<User> findByAll(){
        return userRepository.findAll();
    }



}
