package com.southpartk.ufro.model;

import javax.persistence.*;

@Entity
@Table(name="usuario")
public class Usuario {
    //-|Atributos|----------------------------------------------------------------------------------------------------//
    @Id
    @Column(length=45, nullable=false, unique = true)
    private String name;
    @Column(length=45)
    private String nickName;
    @Column(length=45)
    private String password;

    //-|Construcor|---------------------------------------------------------------------------------------------------//
    public Usuario(String name, String nickName, String password) {
        this.name = name;
        this.nickName = nickName;
        this.password = password;
    }

    public Usuario() {
    }

    //-|Getter y Setter|----------------------------------------------------------------------------------------------//
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
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
                ", nickName='" + nickName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
