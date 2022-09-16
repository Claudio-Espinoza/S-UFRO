package com.southpartk.ufro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("index")
public class UsuarioController {

    @GetMapping("")
    public String initian(){
        System.out.println("Inicio"); //Esto lo pongo para asegurar no mas
        return "login/Initian";
    }

    @GetMapping("login")
    public String logIn(){
        System.out.println("Login");
        return "login/Log-in";
    }


}
