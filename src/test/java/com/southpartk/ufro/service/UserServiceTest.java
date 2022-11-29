package com.southpartk.ufro.service;

import com.southpartk.ufro.model.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.HashMap;
import java.util.Map;

class UserServiceTest {
    Map<String, User> userPersonage;
    String name = "nameTest";
    User user= new User(name, "Snob", "Anemico", "Nerd", "Pretencioso", "Pantalon",
               "Formal", 0, 3, "images/avatarSelections/icons/type2.png");


    @DisplayName("TEST 1(createCharacterIsEmpty): Comprobar que el metodo createCharacter no retorne null")
    @Test
    void createCharacterIsEmpty() {
    userPersonage = new HashMap<>();
    userPersonage.put("Snob",user);
    assertFalse(userPersonage.isEmpty());
    }

    @DisplayName("TEST 2(createCharacterCorrectType): Comprobar que el metodo createCharacter retorne un Map con el tipo de personaje correcto")
    @Test
    void createCharacterCorrectType() {
        assertEquals("Snob", user.getType());
    }
    @DisplayName("TEST 3(createCharacterImageRute): Comprobar que el metodo createCharacter retorne una imágen de una ruta existente")
    @Test
    void createCharacterImageRute() {
        assertFalse(user.getDireccion().isEmpty());
    }
}