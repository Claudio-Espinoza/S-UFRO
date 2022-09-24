package com.southpartk.ufro.controller;

import com.southpartk.ufro.model.User;
import com.southpartk.ufro.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.logging.Logger;

@Controller
@RequestMapping("/")
public class UserController {
    @Autowired //Esto no se puede borrar, se rompe xd
    private UserRepository userRepository;
    private final Logger LOGGER = Logger.getLogger(String.valueOf(UserController.class));

    @GetMapping("")
    public String initian(){
        System.out.println("Inicio"); //Esto lo pongo para asegurar no mas
        return "credentials/InitianPage";
    }

    @GetMapping("loginCredentials")
    public String logIn(){
        System.out.println("Login");
        return "credentials/LoginCredentials";
    }

    @PostMapping("/saveUser")
    public String save(User user){
        LOGGER.info("Usuario:  " + user); //Con esto podemos ver los cambios hechoes en labase de datos, se vera por la consola Uwu
        userRepository.save(user);
        return "redirect:/"; //Esto hay que cambiarlo cuando el juego este listo Owo
                                  //En teoria deberia llevarnos al diseño de personaje
    }

    @GetMapping("/deleteUser/{nombre}")
    public String deleteUser(@PathVariable String nombre){
        userRepository.deleteById(nombre);
        return "redirect:/adminChattelShow";
    }

}
