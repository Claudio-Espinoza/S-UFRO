package com.southpartk.ufro.controller;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserControllerTest {
    @BeforeAll
    static void beforeAll() {;
    }
    @AfterAll
    static void afterAll() {

    }
    @BeforeEach
    void setUp() {
    }
    @AfterEach
    void tearDown() {

    }
    @Test
    void starInitianRutaTest() {
        assertEquals("credentials/InitianPage", new UserController().starInitian());
    }

    @Test
    void createCharacterRutaTest() {
        assertEquals("character/DesignCharacter", new UserController().createCharacter());
    }

    @Test
    void saveUser() {

    }

    @Test
    void deleteUser() {

    }
}