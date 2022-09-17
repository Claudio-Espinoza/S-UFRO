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
public class UserController {
    @Autowired
    private UserService userService;
    private final Logger LOGGER = Logger.getLogger(String.valueOf(UserController.class));

    @GetMapping("")
    public String initian(){
        System.out.println("Inicio"); //Esto lo pongo para asegurar no mas
        return "login/Initian";
    }

    @GetMapping("login")
    public String logIn(){
        System.out.println("Login");
        return "login/Login";
    }

    @PostMapping("/save")
    public String save(User user){
        LOGGER.info("Usuario:  " + user); //Con esto podemos ver los cambios hechoes en labase de datos, se vera por la consola Uwu
        userService.save(user);
        return "redirect:/index"; //Esto hay que cambiarlo cuando el juego este listo Owo
                                  //En teoria deberia llevarnos al diseño de personaje
    }


}
