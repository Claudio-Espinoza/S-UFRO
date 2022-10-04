package com.southpartk.ufro.model;

import javax.persistence.*;

@Entity
public class PersonajePrincipal {
    //-|Atributos|----------------------------------------------------------------------------------------------------//
    @Id
    @Column(length=45, nullable=false, unique = true )
    private String name;
    private String colorHair;
    private String typeHair;

    private String typeTop;

    private String colorTop;

    private String typeButton;

    private String colorButton;

    private String typeShoe;

    private String colorShoe;

    //-|Construcor|---------------------------------------------------------------------------------------------------//
    public PersonajePrincipal() {
    }

    //-|Getter y Setter|----------------------------------------------------------------------------------------------//

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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

//-|toString|-----------------------------------------------------------------------------------------------------//


    @Override
    public String toString() {
        return "PersonajePrincipal{" +
                "nickName=" + name +
                '}';
    }
}
