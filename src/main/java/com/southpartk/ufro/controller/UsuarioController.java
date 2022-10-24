package com.southpartk.ufro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("login")
public class UsuarioController {

    @GetMapping("")
    public String show(Model model){
        System.out.println("Login");
        return "login/Initian";
    }


}
