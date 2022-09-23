package com.southpartk.ufro.controller;

import com.southpartk.ufro.model.Admin;
import com.southpartk.ufro.service.AdminService;
import com.southpartk.ufro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.logging.Logger;

@Controller
@RequestMapping("")
public class AdminController {

    @Autowired
    private UserService userService;

    @Autowired
    private AdminService adminService;

    //-|Ver el panel principal del administrador|-//
    @GetMapping("/adminChattelShow")
    public String showAdmin(Model model) {
            model.addAttribute("user", userService.findByAll());
            System.out.println("Ver Usuario");
        return "admin/ControlUser";
    }

    //-|Ver el panel validaor del administrador|-//
    @GetMapping("/credentialsAdmin")
    public String credentialsAdmin(Model model) {
        System.out.println("Ver Login Admin");
        return "credentials/LoginCredentialsAdmin";
    }

    //-|Validar administrador|-//
    @PostMapping("/validationAdmin")
    public String validationAdmin(String rut) {
        if(adminService.existsById(rut)){
            return  "redirect:/adminChattelShow";
        } else {
            return "redirect:/credentialsAdmin";
        }
    }

}
