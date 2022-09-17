package com.southpartk.ufro.controller;

import com.southpartk.ufro.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.logging.Logger;

@Controller
@RequestMapping("admin")
public class AdminController {

    @Autowired
    private AdminService adminService;
    private final Logger LOGGER = Logger.getLogger(String.valueOf(AdminController.class));

    @GetMapping("/admin")
    public String showAdmin(Model model) {
            model.addAttribute("productos", adminService.findByAll());
            System.out.println("Ver productos");
        return "login_admin";
    };






}
