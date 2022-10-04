package com.southpartk.ufro.model;

import javax.persistence.*;

@Entity
public class PersonajePrincipal {
    //-|Atributos|----------------------------------------------------------------------------------------------------//
    @Id
    @Column(length=45, nullable=false, unique = true )
    private String name;

    private String color;
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
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    //-|toString|-----------------------------------------------------------------------------------------------------//


    @Override
    public String toString() {
        return "PersonajePrincipal{" +
                "nickName=" + name +
                '}';
    }
}
