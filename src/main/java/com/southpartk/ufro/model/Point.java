package com.southpartk.ufro.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Setter
@Getter
public class Point {
    @Id
    @Column(nullable=false, unique = true)
    private Integer nivel;
    private int points;
    private int victoryPoints;

    public Point() {
    }
}
