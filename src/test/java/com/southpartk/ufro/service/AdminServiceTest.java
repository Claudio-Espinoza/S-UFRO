package com.southpartk.ufro.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AdminServiceTest {
    @Autowired
    private AdminService adminService;

    @ParameterizedTest(name = "#{index} - rut: {0}")
    @ValueSource(strings = {"207542628"})
    @DisplayName("existsByIdTest - Con rut correctos")
    void existsByIdCorrectTest(String rut) {
       assertTrue(adminService.existsById(rut));
    }

    @ParameterizedTest(name = "#{index} - rut: {0}")
    @ValueSource(strings = {"207542622", "568445455", "862264315"})
    @DisplayName("existsByIdTest - Con rut Incorrectos")
    void existsByIdFailTest(String rut) {
        assertFalse(adminService.existsById(rut));
    }

    @DisplayName("validationPassword - Con contraseñas Incorrectas")
    @ParameterizedTest(name = "#{index} - rut: {0}")
    @CsvSource({
            "207542628,      56364532",
            "207542628,   5325325325",
            "207542628,    23525235325"
    })
            void validationPasswordErrorTest(String rut, String password) {
          assertFalse(adminService.validationPassword(rut, password));
    }

    @DisplayName("validationPassword - Con contraseñas correctas")
    @ParameterizedTest(name = "#{index} - rut: {0}")
    @CsvSource({
            "207542628,      123456789",
            "207542628,      123456789",
            "207542628,      123456789",
            "207542628,      123456789",
    })
    void validationPasswordCorrectTest(String rut, String password) {
        assertTrue(adminService.validationPassword(rut, password));
    }

    @DisplayName("redirectionWithPasswordGetBackTest - Sacar de la pagina")
    @ParameterizedTest(name = "#{index} - rut: {0}")
    @CsvSource({
            "207542628,      12345489,  redirect:/credentials/LoginCredentialsAdmin",
            "207542628,      22345489,  redirect:/credentials/LoginCredentialsAdmin",
            "207542628,      42345489,  redirect:/credentials/LoginCredentialsAdmin",
            "207542628,      72345489,  redirect:/credentials/LoginCredentialsAdmin"
    })
    void redirectionWithPasswordGetBackTest(String rut, String password, String redireccion) {
        assertEquals(redireccion,adminService.redirectionWithPassword(rut, password));
    }

    @DisplayName("redirectionWithPasswordGetBackTest - Sacar de la pagina")
    @ParameterizedTest(name = "#{index} - rut: {0}")
    @CsvSource({
            "207542628,      123456789,  admin/Menu"
    })
    void redirectionWithPasswordGetEnterTest(String rut, String password, String redireccion) {
        assertEquals(redireccion,adminService.redirectionWithPassword(rut, password));
    }

    @DisplayName("createAdminTest - Crear un admin")
    @ParameterizedTest(name = "#{index} - rut: {0}")
    @CsvSource({
            "201025230,      1234566",
            "201025230,      123456e",
            "201025230,      12456",
            "201025230,      1233456"
    })
    void createAdmin(String rut, String password) {
        adminService.saveAdmin(adminService.createAdmin(rut,password));
        assertTrue(adminService.existsById(rut));
    }



}