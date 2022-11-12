package com.southpartk.ufro.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Personage {
    @Id
    @Column(length = 40, nullable = false, unique = true)
    private String name;
    @Column(length = 20, nullable = false)
    private String lenient;
    @Column(length = 20)
    private String conduct;
    @Column(length = 20)
    private String temperament;
    @Column(length=40)
    private String graduate;

    private int age;
    private int difficulty;

    @Embedded
    private Preference preference;

    public Personage() {}

}
