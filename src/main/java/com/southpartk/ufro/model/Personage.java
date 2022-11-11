package com.southpartk.ufro.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
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
    private int age;
    @Column(length=40)
    private String graduate;
    private int difficulty;

    @Embedded
    private Preference preference;

    public Personage(String name, String lenient, String conduct, String temperament, int age, String graduate, int difficulty, Preference preference) {
        this.name = name;
        this.lenient = lenient;
        this.conduct = conduct;
        this.temperament = temperament;
        this.age = age;
        this.graduate = graduate;
        this.difficulty = difficulty;
        this.preference = preference;
}

    public Personage() {}
    //---------------//

}
