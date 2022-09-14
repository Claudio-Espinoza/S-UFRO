package com.southpartk.ufro.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="admin")
public class Admin {
    //-|Atributos|----------------------------------------------------------------------------------------------------//
    @Id
    @Column(length=11, nullable=false, unique = true)
    private String rut;
    @Column(length=45)
    private String password;

    @OneToMany()
    private List<User> user;

    //-|Constructor|--------------------------------------------------------------------------------------------------//
    public Admin() {
    }

    public Admin(String rut, String password, List<User> user) {
        this.rut = rut;
        this.password = password;
        this.user = user;
    }

    //-|Getter y Setter|----------------------------------------------------------------------------------------------//
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

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }

    //-|toString|-----------------------------------------------------------------------------------------------------//
    @Override
    public String toString() {
        return "Administrador{" +
                "rut='" + rut + '\'' +
                ", password='" + password + '\'' +
                ", User=" + user +
                '}';
    }
}
