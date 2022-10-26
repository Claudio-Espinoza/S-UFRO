package com.southpartk.ufro.model;

import javax.persistence.*;

@Entity
public class PersonajePrincipal {
    //-|Atributos|----------------------------------------------------------------------------------------------------//
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String colorHair;
    private String typeHair;

    private String typeTop;

    private String colorTop;

    private String typeButton;

    private String colorButton;

    private String typeShoe;

    private String colorShoe;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="name")
    private User user;

    //-|Construcor|---------------------------------------------------------------------------------------------------//
    public PersonajePrincipal() {
    }

    //-|Getter y Setter|----------------------------------------------------------------------------------------------//
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getColorHair() {
        return colorHair;
    }
    public void setColorHair(String colorHair) {
        this.colorHair = colorHair;
    }
    public String getTypeHair() {
        return typeHair;
    }
    public void setTypeHair(String typeHair) {
        this.typeHair = typeHair;
    }

    public String getTypeTop() {
        return typeTop;
    }

    public void setTypeTop(String typeTop) {
        this.typeTop = typeTop;
    }

    public String getColorTop() {
        return colorTop;
    }

    public void setColorTop(String colorTop) {
        this.colorTop = colorTop;
    }

    public String getTypeButton() {
        return typeButton;
    }

    public void setTypeButton(String typeButton) {
        this.typeButton = typeButton;
    }

    public String getColorButton() {
        return colorButton;
    }

    public void setColorButton(String colorButton) {
        this.colorButton = colorButton;
    }

    public String getTypeShoe() {
        return typeShoe;
    }

    public void setTypeShoe(String typeShoe) {
        this.typeShoe = typeShoe;
    }

    public String getColorShoe() {
        return colorShoe;
    }

    public void setColorShoe(String colorShoe) {
        this.colorShoe = colorShoe;
    }

}
