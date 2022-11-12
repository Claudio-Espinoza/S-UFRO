package com.southpartk.ufro.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Point {
    @Id
    @Column(nullable=false, unique = true)
    private Integer nivel;
    private int correctPoints;
    private int errorPoints;
    private int victoryPoints;
    private int endGamePoints;

    public Point() {
    }

    public Point(int nivel, int correctPoints, int errorPoints, int victoryPoints, int endGamePoints) {
        this.nivel = nivel;
        this.correctPoints = correctPoints;
        this.errorPoints = errorPoints;
        this.victoryPoints = victoryPoints;
        this.endGamePoints = endGamePoints;
    }


}
