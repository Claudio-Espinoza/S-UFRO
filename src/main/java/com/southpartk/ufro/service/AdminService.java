package com.southpartk.ufro.service;

import com.southpartk.ufro.model.Admin;
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



    public boolean existsById(String rut) {
        return adminRepository.existsById(rut);
    }

    public boolean validationPassword(String rut, String password) {
        return getPassword(rut).equals(password);
    }

    private String getPassword(String rut){
        var admin = adminRepository.findById(rut);
        return admin.get().getPassword();
    }


    public String redirectionWithPassword(String rut, String password){
        if(validationPassword(rut, password)){
            return "admin/Menu";
        }else{
            return "redirect:/credentials/LoginCredentialsAdmin";
        }
    }

    public Admin createAdmin(String rut, String password){
        var adminNuevo = new Admin(rut, password);
        return adminNuevo;
    }
    public void saveAdmin(Admin admin){
        adminRepository.save(createAdmin(admin.getRut(), admin.getPassword()));
    }

    public Iterable<User> findByAll(){
        return userRepository.findAll();
    }
}
