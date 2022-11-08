package com.southpartk.ufro.model;

import javax.persistence.*;

@Entity
public class User {
    //-|Atributos|----------------------------------------------------------------------------------------------------//
    @Id
    @Column(length = 45, nullable = false, unique = true)
    private String name;
    private String type;
    private String skin;
    private String typeHair;
    private String typeTop;
    private String typeButton;
    private String typeShoe;

    //-|Construcor|---------------------------------------------------------------------------------------------------//
    public User() {
    }

    //Constructor con el fin de modificar los item no escenciales y poder guardarlos sin modificar los otros elementos UwU


    public User(String name, String type, String skin, String typeHair, String typeTop, String typeButton, String typeShoe) {
        this.name = name;
        this.type = type;
        this.skin = skin;
        this.typeHair = typeHair;
        this.typeTop = typeTop;
        this.typeButton = typeButton;
        this.typeShoe = typeShoe;
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

}
