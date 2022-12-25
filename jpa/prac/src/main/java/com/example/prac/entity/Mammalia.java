package com.example.prac.entity;

import com.example.prac.embeddable.AnimalFigure;
import lombok.*;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("MAMMALIA")
@Table(name = "TBL_MAMMALIA")
@Getter @Setter @ToString
@NoArgsConstructor
public class Mammalia extends Animal {
    private int mammaliaLeg;

    public void create(String animalName, String animalBreeding, AnimalFigure animalFigure, int mammaliaLeg) {
        super.create(animalName,animalBreeding, animalFigure);
        this.mammaliaLeg = mammaliaLeg;
    }
}
