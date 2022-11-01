package com.southpartk.ufro.controller;

import com.southpartk.ufro.model.PersonagePrimary;
import com.southpartk.ufro.repository.PersonajePrincipalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.logging.Logger;

@Controller
@RequestMapping("/")
public class PersonagePrimaryController {

    @Autowired
    PersonajePrincipalRepository personajePrincipalRepository;
    private final Logger LOGGER = Logger.getLogger(String.valueOf(PersonagePrimaryController.class));

    @PostMapping("/savePersonaje")
    public String savePersonaje(PersonagePrimary personagePrimary){
        LOGGER.info("nick:  " + personagePrimary);
        personajePrincipalRepository.save(personagePrimary);
        return "redirect:/";
    }
}
