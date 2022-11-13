package com.southpartk.ufro.service;

import com.southpartk.ufro.model.User;
import com.southpartk.ufro.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;


@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    private void saveCharacter(Map user, String typeUser){
        var userSave = (User)user.get(typeUser);
        userRepository.save(userSave);
    }
    public void selectionCharacter(String name, String typeUser){
        var userCharacter = createCharacter(name);
        saveCharacter(userCharacter,typeUser);
    }
    private Map<String, User> createCharacter(String name){
        Map<String, User> userPersonage = new HashMap<>();
        userPersonage.put("Snob",saveObjectSnob(name));
        userPersonage.put("PorDefecto",saveObjectPorDefecto(name));
        userPersonage.put("Rubio",saveObjectRubio(name));
        userPersonage.put("Carbon",saveObjectCarbon(name));
        userPersonage.put("Informatico",saveObjectInformatico(name));
        userPersonage.put("Simbolo",saveObjectSimbolo(name));
        return userPersonage;
    }
    private User saveObjectSnob(String name){
        return new User(name, "Snob", "Anemico", "Nerd", "Pretencioso", "Pantalon", "Formal", 0, 3);
    }
    private User saveObjectPorDefecto(String name){
        return new  User(name, "PorDefecto", "Humilde", "Generico", "Deportivo", "Buzo", "Tenis", 0, 3);
    }
    private User saveObjectRubio(String name){
        return new  User(name, "Rubio", "KKK", "Rubio", "Informal", "Jeans", "Comodos", 0, 3);
    }
    private User saveObjectCarbon(String name){
        return new User(name, "Carbon" , "Carbon", "Afro", "Chaleco", "Jeans", "Jordan", 0, 3);
    }
    private User saveObjectInformatico(String name){
        return new  User(name, "Informatico", "Anemia", "None", "Poleron", "Buzo", "Desconocido", 0, 3);
    }
    private User saveObjectSimbolo(String name){
        return new User(name, "Simbolo", "Actualizable", "Caotico", "Tuneado", "Disabled", "None", 0, 3);
    }

}
