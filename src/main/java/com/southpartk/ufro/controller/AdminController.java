package com.southpartk.ufro.controller;

import com.southpartk.ufro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.logging.Logger;

@Controller
@RequestMapping("")
public class AdminController {

    @Autowired
    private UserService UserService;
    private final Logger LOGGER = Logger.getLogger(String.valueOf(AdminController.class));

    @GetMapping("/AdminChattelShow")
    public String showAdmin(Model model) {
            model.addAttribute("user", UserService.findByAll());
            System.out.println("Ver Usuario");
        return "admin/ControlUser";
    };

}
