package com.example.prac.entity;

import com.example.prac.embeddable.AnimalFigure;
import lombok.*;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "ANIMAL_TYPE")
@Table(name = "TBL_ANIMAL")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Animal{
    @Id @GeneratedValue
    private Long animalId;
    private String animalName;
    private String animalBreeding;
    @Embedded
    private AnimalFigure animalFigure;

    public void create(String animalName, String animalBreeding, AnimalFigure animalFigure) {
        this.animalName = animalName;
        this.animalBreeding = animalBreeding;
        this.animalFigure = animalFigure;
    }
}
