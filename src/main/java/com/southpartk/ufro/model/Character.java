package com.southpartk.ufro.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Setter
@Getter
public class Character {
    @Id
    @Column(length = 40, nullable = false, unique = true)
    private String name;
    @Column(length = 20, nullable = false)
    private String lenient;
    @Column(length = 20)
    private String conduct;
    @Column(length = 20)
    private String temperament;
    private int age;
    @Column(length=40)
    private String graduate;
    private int difficulty;

    @Embedded
    private Preference preference;

    public Character() {}
}
