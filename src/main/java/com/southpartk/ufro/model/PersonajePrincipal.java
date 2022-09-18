package com.southpartk.ufro.model;

import javax.persistence.*;

@Entity
@Table(name="personaje_principal")
public class PersonajePrincipal {

    @Id
    @Column(length=45, nullable=false, unique = true)
    private String nickName;

    @Column(length=16, nullable=false, unique = true)
    private String color;

    @Column(length=45, nullable=false, unique = true)
    private double peso;

    @Column(length=45, nullable=false, unique = true)
    private double altura;

    @Column(length=45, nullable=false, unique = true)
    private String etnia;

    @Column(length=50, nullable=false, unique = true)
    private int karma;

    @OneToOne
    private User user;


    public PersonajePrincipal() {
    }
}
