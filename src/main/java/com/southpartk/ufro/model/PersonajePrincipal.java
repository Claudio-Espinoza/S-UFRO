package com.southpartk.ufro.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PersonajePrincipal {
    //-|Atributos|----------------------------------------------------------------------------------------------------//
    @Id
    private Integer id;
    private String colorSkin;
    private String glass;
    private String beard;

    private String typeHair;
    private String colorHair;

    private String typeTShirt;
    private String colorTShirt;

    private String typePants;
    private String colorPants;

    private String typeSneakers;
    private String colorSneakers;

    //-|Construcor|---------------------------------------------------------------------------------------------------//
    public PersonajePrincipal() {
    }

    //-|Getter y Setter|----------------------------------------------------------------------------------------------//

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColorSkin() {
        return colorSkin;
    }

    public void setColorSkin(String colorSkin) {
        this.colorSkin = colorSkin;
    }

    public String getGlass() {
        return glass;
    }

    public void setGlass(String glass) {
        this.glass = glass;
    }

    public String getBeard() {
        return beard;
    }

    public void setBeard(String beard) {
        this.beard = beard;
    }

    public String getTypeHair() {
        return typeHair;
    }

    public void setTypeHair(String typeHair) {
        this.typeHair = typeHair;
    }

    public String getColorHair() {
        return colorHair;
    }

    public void setColorHair(String colorHair) {
        this.colorHair = colorHair;
    }

    public String getTypeTShirt() {
        return typeTShirt;
    }

    public void setTypeTShirt(String typeTShirt) {
        this.typeTShirt = typeTShirt;
    }

    public String getColorTShirt() {
        return colorTShirt;
    }

    public void setColorTShirt(String colorTShirt) {
        this.colorTShirt = colorTShirt;
    }

    public String getTypePants() {
        return typePants;
    }

    public void setTypePants(String typePants) {
        this.typePants = typePants;
    }

    public String getColorPants() {
        return colorPants;
    }

    public void setColorPants(String colorPants) {
        this.colorPants = colorPants;
    }

    public String getTypeSneakers() {
        return typeSneakers;
    }

    public void setTypeSneakers(String typeSneakers) {
        this.typeSneakers = typeSneakers;
    }

    public String getColorSneakers() {
        return colorSneakers;
    }

    public void setColorSneakers(String colorSneakers) {
        this.colorSneakers = colorSneakers;
    }


    //-|toString|-----------------------------------------------------------------------------------------------------//


    @Override
    public String toString() {
        return "PersonajePrincipal{" +
                "id=" + id +
                ", colorSkin='" + colorSkin + '\'' +
                ", glass='" + glass + '\'' +
                ", beard='" + beard + '\'' +
                ", typeHair='" + typeHair + '\'' +
                ", colorHair='" + colorHair + '\'' +
                ", typeTShirt='" + typeTShirt + '\'' +
                ", colorTShirt='" + colorTShirt + '\'' +
                ", typePants='" + typePants + '\'' +
                ", colorPants='" + colorPants + '\'' +
                ", typeSneakers='" + typeSneakers + '\'' +
                ", colorSneakers='" + colorSneakers + '\'' +
                '}';
    }
}
