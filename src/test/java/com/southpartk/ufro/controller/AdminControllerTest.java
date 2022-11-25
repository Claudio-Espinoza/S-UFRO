package com.southpartk.ufro.controller;

import com.southpartk.ufro.repository.UserRepository;
import com.southpartk.ufro.service.AdminService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.ui.Model;

import static org.mockito.Mockito.mock;

@SpringBootTest
@Tag("Pruebas de AdminController")
public class AdminControllerTest {

    UserRepository userRepository;
    AdminService adminService;
    Model model;

    @BeforeAll
    public void init() {
    }

    @Test
    void showAdmin() {
    }

    @Test
    void showMenuAdmin() {
    }

    @Test
    void credentialsAdmin() {
    }

    @Test
    void validationAdmin() {
    }
}
