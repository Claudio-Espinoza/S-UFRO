package com.southpartk.ufro.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Personage {

    //-|Atributos de Identificador-|//
    @Id
    @Column(length = 40, nullable = false, unique = true)
    private String name;
    @Column(length = 20, nullable = false)
    private String lenient;
    @Column(length = 20)
    private String conduct;
    @Column(length = 20)
    private String temperament;
    private String age;
    @Column(length=40)
    private String graduate;
    private int difficulty;


    @Embedded
    private Preference preference;

    public Personage(String name, String lenient, String conduct, String temperament, String age, String graduate, int difficulty, Preference preference) {
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


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLenient() {
        return lenient;
    }

    public void setLenient(String lenient) {
        this.lenient = lenient;
    }

    public String getConduct() {
        return conduct;
    }

    public void setConduct(String conduct) {
        this.conduct = conduct;
    }

    public String getTemperament() {
        return temperament;
    }

    public void setTemperament(String temperament) {
        this.temperament = temperament;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGraduate() {
        return graduate;
    }

    public void setGraduate(String graduate) {
        this.graduate = graduate;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }
}
