package com.southpartk.ufro.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Preference {
    @Column(length=20)
    private String preferColorHair;
    @Column(length=20)
    private String preferTypeHair;
    @Column(length=20)
    private String preferTypeTop;
    @Column(length=20)
    private String preferColorTop;
    @Column(length=20)
    private String preferTypeButton;
    @Column(length=20)
    private String preferColorButton;
    @Column(length=20)
    private String preferTypeShoe;
    @Column(length=20)
    private String preferColorShoe;

}
