package com.southpartk.ufro.controller;

import com.southpartk.ufro.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class UserController {
    //Esto no se puede borrar, se rompe xd
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("")
    public String initian(){
        return "credentials/InitianPage";
    }

    @GetMapping("createCharacter")
    public String createCharacter(){
        return "character/DesignCharacter";
    }

    @PostMapping("/saveUser")
    public String save(String type, String name) {
       userService.selectionCharacter(name, type);
        return "redirect:/"; //Cambiar la direccion,
    }

    @GetMapping("/deleteUser/{nombre}")
    public String deleteUser(@PathVariable String nombre){
        userService.deleteByIdUser(nombre);
        return "redirect:/adminChattelShow";
    }

}
