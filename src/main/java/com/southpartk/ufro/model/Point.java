package com.southpartk.ufro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
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
 
    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getCorrectPoints() {
        return correctPoints;
    }

    public void setCorrectPoints(int correctPoints) {
        this.correctPoints = correctPoints;
    }

    public int getErrorPoints() {
        return errorPoints;
    }

    public void setErrorPoints(int errorPoints) {
        this.errorPoints = errorPoints;
    }

    public int getVictoryPoints() {
        return victoryPoints;
    }

    public void setVictoryPoints(int victoryPoints) {
        this.victoryPoints = victoryPoints;
    }

    public int getEndGamePoints() {
        return endGamePoints;
    }

    public void setEndGamePoints(int endGamePoints) {
        this.endGamePoints = endGamePoints;
    }
}
