package com.southpartk.ufro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Personage {

    //-|Atributos de Identificador-|//
    @Id
    @Column(length=40, nullable=false, unique = true)
    private String name;
    //------------------------------//

    //-|Atributos de utiles|-//
    private String lenient;
    private String level;
    private String conduct;
    private String temperament;
    private String age;
    private String graduate;
    private String difficulty;
    //-|---------------------//

    //-|Atributos de preferencia|-//
    private String preferColorHair;
    private String preferTypeHair;
    private String preferTypeTop;
    private String preferColorTop;
    private String preferTypeButton;
    private String preferColorButton;
    private String preferTypeShoe;
    private String preferColorShoe;
    //-----------------------------//

    //-|Constructor|-//
    public Personage(String name, String lenient, String level, String conduct, String temperament, String age, String graduate, String difficulty, String preferColorHair, String preferTypeHair, String preferTypeTop, String preferColorTop, String preferTypeButton, String preferColorButton, String preferTypeShoe, String preferColorShoe) {
        this.name = name;
        this.lenient = lenient;
        this.level = level;
        this.conduct = conduct;
        this.temperament = temperament;
        this.age = age;
        this.graduate = graduate;
        this.difficulty = difficulty;
        this.preferColorHair = preferColorHair;
        this.preferTypeHair = preferTypeHair;
        this.preferTypeTop = preferTypeTop;
        this.preferColorTop = preferColorTop;
        this.preferTypeButton = preferTypeButton;
        this.preferColorButton = preferColorButton;
        this.preferTypeShoe = preferTypeShoe;
        this.preferColorShoe = preferColorShoe;
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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
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

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getPreferColorHair() {
        return preferColorHair;
    }

    public void setPreferColorHair(String preferColorHair) {
        this.preferColorHair = preferColorHair;
    }

    public String getPreferTypeHair() {
        return preferTypeHair;
    }

    public void setPreferTypeHair(String preferTypeHair) {
        this.preferTypeHair = preferTypeHair;
    }

    public String getPreferTypeTop() {
        return preferTypeTop;
    }

    public void setPreferTypeTop(String preferTypeTop) {
        this.preferTypeTop = preferTypeTop;
    }

    public String getPreferColorTop() {
        return preferColorTop;
    }

    public void setPreferColorTop(String preferColorTop) {
        this.preferColorTop = preferColorTop;
    }

    public String getPreferTypeButton() {
        return preferTypeButton;
    }

    public void setPreferTypeButton(String preferTypeButton) {
        this.preferTypeButton = preferTypeButton;
    }

    public String getPreferColorButton() {
        return preferColorButton;
    }

    public void setPreferColorButton(String preferColorButton) {
        this.preferColorButton = preferColorButton;
    }

    public String getPreferTypeShoe() {
        return preferTypeShoe;
    }

    public void setPreferTypeShoe(String preferTypeShoe) {
        this.preferTypeShoe = preferTypeShoe;
    }

    public String getPreferColorShoe() {
        return preferColorShoe;
    }

    public void setPreferColorShoe(String preferColorShoe) {
        this.preferColorShoe = preferColorShoe;
    }
}
