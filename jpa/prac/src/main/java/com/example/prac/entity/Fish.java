package com.example.prac.entity;

import com.example.prac.embeddable.AnimalFigure;
import lombok.*;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("FISH")
@Table(name = "TBL_FISH")
@Getter @Setter @ToString
@NoArgsConstructor
public class Fish extends Animal{
    private String fishShape;

    public void create(String animalName, String animalBreeding, AnimalFigure animalFigure, String fishShape) {
        super.create(animalName,animalBreeding, animalFigure);
        this.fishShape = fishShape;
    }
}
