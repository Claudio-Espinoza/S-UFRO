package com.southpartk.ufro.controller;

import com.southpartk.ufro.model.User;
import com.southpartk.ufro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.logging.Logger;

@Controller
@RequestMapping("index")
public class UsuarioController {
    @Autowired
    private UserService userService;
    private final Logger LOGGER = Logger.getLogger(String.valueOf(UsuarioController.class));

    @GetMapping("")
    public String initian(){
        System.out.println("Inicio"); //Esto lo pongo para asegurar no mas
        return "login/Initian";
    }

    @GetMapping("login")
    public String logIn(){
        System.out.println("Login");
        return "login/Log-In";
    }

    @PostMapping("/save")
    public String save(User user){
        LOGGER.info("Usuario:  " + user);
        userService.save(user);
        return "redirect:/index"; //Esto hay que cambiarlo cuando el juego este listo Owo
    }


}
