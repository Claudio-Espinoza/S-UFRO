package com.southpartk.ufro.model;

import javax.persistence.*;

@Entity
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

    //-|Getter y Setter|----------------------------------------------------------------------------------------------//
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypeHair() {
        return typeHair;
    }

    public void setTypeHair(String typeHair) {
        this.typeHair = typeHair;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public String getTypeTop() {
        return typeTop;
    }

    public void setTypeTop(String typeTop) {
        this.typeTop = typeTop;
    }

    public String getTypeButton() {
        return typeButton;
    }

    public void setTypeButton(String typeButton) {
        this.typeButton = typeButton;
    }

    public String getTypeShoe() {
        return typeShoe;
    }

    public void setTypeShoe(String typeShoe) {
        this.typeShoe = typeShoe;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }
}
