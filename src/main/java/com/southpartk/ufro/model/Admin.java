package com.southpartk.ufro.model;

<<<<<<< HEAD
import javax.persistence.*; //code smells
=======
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
>>>>>>> f7befb717b2ff6b2c6f23bdfe73115b9ce51e80d

@Entity
@Getter
@Setter
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
}
