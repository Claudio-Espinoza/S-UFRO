package com.southpartk.ufro.controller;

import com.southpartk.ufro.repository.UserRepository;
import com.southpartk.ufro.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class AdminController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AdminService adminService;


    //-|Ver el panel principal del administrador|-//
    @GetMapping("/adminChattelShow")
    public String showAdmin(Model model) {
            model.addAttribute("user", userRepository.findAll());
        return "admin/ControlUser";
    }

    //-|Ver el menu del administrador|-//
    @GetMapping("/adminShowMenu")
    public String showMenuAdmin() {
        return "admin/Menu";
    }

    //-|Ver el panel validaor del administrador|-//
    @GetMapping("/accreditAdmin")
    public String accreditAdmin() {
        return "credentials/LoginCredentialsAdmin";
    }

    //-|Validar administrador|-//
    @PostMapping("/validationAdmin")
    public String validationAdmin(String rut, String password) {
        return adminService.existsById(rut, password);
    }

}
