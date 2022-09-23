package com.southpartk.ufro.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="usuario")
public class User {
    //-|Atributos|----------------------------------------------------------------------------------------------------//
    @Id
    @Column(length=45, nullable=false, unique = true )
    private String name;
    @Column(length=45)
    private String password;

    //-|Construcor|---------------------------------------------------------------------------------------------------//
    public User() {
    }

    //-|Getter y Setter|----------------------------------------------------------------------------------------------//
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //-|toString|-----------------------------------------------------------------------------------------------------//
    @Override
    public String toString() {
        return "Usuario{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
