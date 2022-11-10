package com.southpartk.ufro.service;

import com.southpartk.ufro.model.User;
import com.southpartk.ufro.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public void ChangeUser(String name, String typeUser) {
        switch (typeUser) {
            case "PorDefecto":
                saveObjectPorDefecto(name, typeUser);
                break;

            case "Snob": //Es el habin pero no queremos decir que es el habin, pero en efecto... es el habin
                saveObjectSnob(name, typeUser);
                break;

            case "Rubio": //Es el benja pero no queremos decir que es el benja, pero en efecto... es el benja
                saveObjectRubio(name, typeUser);
                break;

            case "Carbon":
                saveObjectCarbon(name, typeUser);
                break;

            case "Simbolo":
                saveObjectSimbolo(name, typeUser);
                break;

            case "Informatico":
                saveObjectInformatico(name, typeUser);
                break;
        }
    }

    public void saveObjectSnob(String name, String typeUser){
        User user = new User(name, typeUser, "Anemico", "Nerd", "Pretencioso", "Pantalon", "Formal", 0, 3);
        userRepository.save(user);
    }

    public void saveObjectPorDefecto(String name, String typeUser){
        User user = new User(name, typeUser, "Humilde", "Generico", "Deportivo", "Buzo", "Tenis", 0, 3);
        userRepository.save(user);
    }

    public void saveObjectRubio(String name, String typeUser){
        User user = new User(name, typeUser, "KKK", "Rubio", "Informal", "Jeans", "Comodos", 0, 3);
        userRepository.save(user);
    }

    public void saveObjectCarbon(String name, String typeUser){
        User user = new User(name, typeUser, "Carbon", "Afro", "Chaleco", "Jeans", "Jordan", 0, 3);
        userRepository.save(user);
    }

    public void saveObjectInformatico(String name, String typeUser){
        User user  = new User(name, typeUser, "Anemia", "None", "Poleron", "Buzo", "Desconocido", 0, 3);
        userRepository.save(user);
    }

    public void saveObjectSimbolo(String name, String typeUser){
        User user = new User(name, typeUser, "Actualizable", "Caotico", "Tuneado", "Disabled", "None", 0, 3);
        userRepository.save(user);
    }

}
