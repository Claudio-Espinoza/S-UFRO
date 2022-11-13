package com.southpartk.ufro.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Setter
@Getter
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

}
