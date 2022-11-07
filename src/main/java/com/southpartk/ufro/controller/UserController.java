package com.southpartk.ufro.controller;

import com.southpartk.ufro.model.User;
import com.southpartk.ufro.repository.UserRepository;
import com.southpartk.ufro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class UserController {
    @Autowired //Esto no se puede borrar, se rompe xd
    private UserRepository userRepository;

    @Autowired //Esto no se puede borrar, se rompe xd
    private UserService userService;


    @GetMapping("")
    public String initian(){
        return "credentials/InitianPage";
    }

    @GetMapping("createCharacter")
    public String createCharacter(){
        return "character/DesignCharacter";
    }

    @PostMapping("/saveUser")
    public String save(User user, String name){
        System.out.println(name);
        userRepository.save(user);
        userService.ChangeUser(name);
        return "redirect:/"; //Cambiar la direccion
    }

    @GetMapping("/deleteUser/{nombre}")
    public String deleteUser(@PathVariable String nombre){
        userRepository.deleteById(nombre);
        return "redirect:/adminChattelShow";
    }

}
