package com.southpartk.ufro.service;

import com.southpartk.ufro.model.User;
import com.southpartk.ufro.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public void ChangeUser(String nombre) {
        var user = userRepository.findById(nombre);
        var typeUser= user.get().getType();

        conditionTypeUser(typeUser, user);
    }

    public  void conditionTypeUser(String typeUser, Optional<User> user){
        switch (typeUser){
            case "PorDefecto":
                user.get().setTypeHair("Generico");
                user.get().setTypeButton("Deportivo");
                user.get().setSkin("Humilde");
                user.get().setTypeTop("Buzo");
                user.get().setTypeShoe("Tenis");
                break;

            case "Snob": //Es el habin pero no queremos decir que es el habin, pero en efecto... es el habin
                user.get().setTypeHair("Nerd");
                user.get().setTypeButton("Formal");
                user.get().setSkin("Anemia");
                user.get().setTypeTop("Pretencioso");
                user.get().setTypeShoe("Formal");
                break;

            case "Rubio":
                user.get().setTypeHair("Rubio");
                user.get().setTypeButton("Informal");
                user.get().setSkin("KKK");
                user.get().setTypeTop("Jeans");
                user.get().setTypeShoe("Comodos");
                break;

            case "Carbon":
                user.get().setTypeHair("Afro");
                user.get().setSkin("Carbon");
                user.get().setTypeButton("Chaleco");
                user.get().setTypeTop("Jeans");
                user.get().setTypeShoe("Jordan");
                break;

            case "Simbolo":
                user.get().setTypeHair("Caotico");
                user.get().setSkin("Actualizable");
                user.get().setTypeButton("Disabled");
                user.get().setTypeTop("Tuneado");
                user.get().setTypeShoe("None");
                break;

            case "Informatico":
                user.get().setTypeHair("None"); //La calvicie viene con la carrera
                user.get().setSkin("Anemia"); //No le llega el sol
                user.get().setTypeButton("Buzo"); //Ropa comoda
                user.get().setTypeTop("Poleron"); //Generico
                user.get().setTypeShoe("Desconocido"); //No se ve los pies
                break;
        }

    }

}
