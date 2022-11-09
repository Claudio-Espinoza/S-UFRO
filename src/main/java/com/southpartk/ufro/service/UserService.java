package com.southpartk.ufro.service;

import com.southpartk.ufro.model.User;
import com.southpartk.ufro.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public User ChangeUser(String name, String typeUser) {
        switch (typeUser) {
            case "PorDefecto":
                return new User(name, typeUser, "Humilde", "Generico", "Deportivo", "Buzo", "Tenis");

            case "Snob": //Es el habin pero no queremos decir que es el habin, pero en efecto... es el habin
                return new User(name, typeUser, "Anemia", "Nerd", "Pretencioso", "Pantalon", "Formal");

            case "Rubio": //Es el benja pero no queremos decir que es el benja, pero en efecto... es el benja
                return  new User(name, typeUser, "KKK", "Rubio", "Informal", "Jeans", "Comodos");

            case "Carbon":
                return new User(name, typeUser, "Carbon", "Afro", "Chaleco", "Jeans", "Jordan");

            case "Simbolo":
                return new User(name, typeUser, "Actualizable", "Caotico", "Tuneado", "Disabled", "None");

            case "Informatico":
                return new User(name, typeUser, "Anemia", "None", "Poleron", "Buzo", "Desconocido");
        }
        return new User();
    }
}
