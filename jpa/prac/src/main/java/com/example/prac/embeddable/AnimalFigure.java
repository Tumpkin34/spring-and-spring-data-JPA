package com.example.prac.embeddable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Embeddable;

@Embeddable
public class AnimalFigure {
    private int animalSize;
    private int animalHorn;

    public void create(int animalSize, int animalHorn) {
        this.animalSize = animalSize;
        this.animalHorn = animalHorn;
    }
}
