package com.southpartk.ufro.model;

import javax.persistence.*;

@Entity
public class Admin {
    //-|Atributos|----------------------------------------------------------------------------------------------------//
    @Id
    @Column(length=11, nullable=false, unique = true)
    private String rut;
    @Column(length=40, unique = true)
    private String password;


    //-|Constructor|--------------------------------------------------------------------------------------------------//
    public Admin() {
    }

    public Admin(String rut, String password) {
        this.rut = rut;
        this.password = password;
    }

    //-|getter/Setter|-----------------------------------------------------------------------------------------------------//
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
