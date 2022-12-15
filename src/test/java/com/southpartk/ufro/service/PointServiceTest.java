package com.southpartk.ufro.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PointServiceTest {

    @Autowired
    PointService pointService;

    @BeforeEach
    void setUp() {

        System.out.println("Iniciacion de las pruebas de TDD");
    }

    @DisplayName("Calculo puntaje")
    @ParameterizedTest(name = "#{index} - Puntos optenidos: {0}/ Puntos potenciados: {1}/ Nivel: {2}")
    @CsvSource({
            "4,    8,    4",
            "3,    6,    4",
            "1,    2,    4"
    })
    void multiplyPointsTest(int pointToAssert, int pointWithLevel, int level) {
        assertEquals(pointWithLevel, pointService.multiplyPoints(pointToAssert ,level));
    }


    @DisplayName("Calculo mutilplicador")
    @ParameterizedTest(name = "#{index} - Level: {0}/ MultiplyPoints: {1}")
    @CsvSource({
            "4,     2",
            "3,     2",
            "1,     1"
    })
    void getMultiplyPointLevelTest(int actualyLevel, int multiplyPoints) {
        assertEquals(multiplyPoints, pointService.getMultiplyPointLevel(actualyLevel));
    }


    @ParameterizedTest(name = "#{index} - resultado: {0}/ nivel: {1}")
    @CsvSource({
            "200,     2",
            "400,     4",
            "600,     6"
    })
    @DisplayName("Calcular puntos por victoria")
    void calculatePointForLevelTest(int result, int level){
        assertEquals(result, pointService.calculatePointForLevel(level));
    }



    @AfterEach
    void tearDown() {
        System.out.println("finalizacion de las pruebas de TDD");
    }

}