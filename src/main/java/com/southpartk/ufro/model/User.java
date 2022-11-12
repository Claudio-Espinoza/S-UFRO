package com.southpartk.ufro.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class User {
    //-|Atributos|----------------------------------------------------------------------------------------------------//
    @Id
    @Column(length = 45, nullable = false, unique = true)
    private String name;
    @Column(length=20, nullable=false)
    private String type;
    @Column(length=20, nullable=false)
    private String skin;
    @Column(length=20, nullable=false)
    private String typeHair;
    @Column(length=20, nullable=false)
    private String typeTop;
    @Column(length=20, nullable=false)
    private String typeButton;
    @Column(length=20, nullable=false)
    private String typeShoe;
    private int points;
    private int life;

    //-|Construcor|---------------------------------------------------------------------------------------------------//
    public User() {
    }

    //Constructor con el fin de modificar los item no escenciales y poder guardarlos sin modificar los otros elementos UwU
    public User(String name, String type, String skin, String typeHair, String typeTop, String typeButton, String typeShoe, int points, int life) {
        this.name = name;
        this.type = type;
        this.skin = skin;
        this.typeHair = typeHair;
        this.typeTop = typeTop;
        this.typeButton = typeButton;
        this.typeShoe = typeShoe;
        this.points = points;
        this.life = life;
    }



}
