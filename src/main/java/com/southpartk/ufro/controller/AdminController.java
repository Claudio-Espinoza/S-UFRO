package com.southpartk.ufro.controller;

import com.southpartk.ufro.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class AdminController {

    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    //-|Ver el panel principal del administrador|-//
    @GetMapping("/adminChattelShow")
    public String showAdmin(Model model) {
            model.addAttribute("user", adminService.findByAll());
        return "admin/ControlUser";
    }

    //-|Ver el menu del administrador|-//
    @GetMapping("/adminShowMenu")
    public String showMenuAdmin() {
        return "admin/Menu";
    }

    //-|Ver el panel validaor del administrador|-//
    @GetMapping("/credentialsAdmin")
    public String credentialsAdmin() {
        return "credentials/LoginCredentialsAdmin";
    }

    //-|Validar administrador|-//
    @PostMapping("/validationAdmin")
    public String validationAdmin(String rut, String password) {
        if(adminService.existsById(rut)){
            return adminService.redirectionWithPassword(rut, password);
        }else{
            return "redirect:/credentials/LoginCredentialsAdmin";
        }
    }

}
