package com.southpartk.ufro.controller;

import com.southpartk.ufro.model.PersonajePrincipal;
import com.southpartk.ufro.repository.PersonajePrincipalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.logging.Logger;

@Controller
@RequestMapping("/")
public class PersonajePrincipalController {

    @Autowired
    PersonajePrincipalRepository personajePrincipalRepository;
    private final Logger LOGGER = Logger.getLogger(String.valueOf(PersonajePrincipalController.class));

    @PostMapping("/savePersonaje")
    public String savePersonaje(PersonajePrincipal personajePrincipal){
        LOGGER.info("nick:  " + personajePrincipal);
        personajePrincipalRepository.save(personajePrincipal);
        return "redirect:/";
    }
}
