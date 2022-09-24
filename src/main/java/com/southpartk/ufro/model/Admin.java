package com.southpartk.ufro.model;

import javax.persistence.*;

@Entity
public class Admin {
    //-|Atributos|----------------------------------------------------------------------------------------------------//
    @Id
    @Column(length=11, nullable=false, unique = true)
    private String rut;
    @Column(length=45)
    private String password;

    //-|Constructor|--------------------------------------------------------------------------------------------------//
    public Admin() {
    }

    public Admin(String rut, String password) {
        this.rut = rut;
        this.password = password;
    }
    //-|toString|-----------------------------------------------------------------------------------------------------//
    @Override
    public String toString() {
        return "Administrador{" +
                "rut='" + rut + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
