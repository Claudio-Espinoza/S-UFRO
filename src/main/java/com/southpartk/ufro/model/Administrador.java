package com.southpartk.ufro.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="administrador")
public class Administrador {
    //-|Atributos|----------------------------------------------------------------------------------------------------//
    @Id
    @Column(length=11, nullable=false, unique = true)
    private String rut;
    @Column(length=45)
    private String password;

    @OneToMany()
    private List<Usuario> usuarios;

    //-|Constructor|--------------------------------------------------------------------------------------------------//
    public Administrador() {
    }

    public Administrador(String rut, String password, List<Usuario> usuarios) {
        this.rut = rut;
        this.password = password;
        this.usuarios = usuarios;
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

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    //-|toString|-----------------------------------------------------------------------------------------------------//
    @Override
    public String toString() {
        return "Administrador{" +
                "rut='" + rut + '\'' +
                ", password='" + password + '\'' +
                ", ordenes=" + usuarios +
                '}';
    }
}
