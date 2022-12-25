package com.example.prac.entity;

import com.example.prac.embeddable.AnimalFigure;
import com.example.prac.repository.FishRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Slf4j
@Transactional
@Rollback(false)
public class FishTest {
    @Autowired
    private FishRepository fishRepository;

    @Test
    public void saveTest(){
        Fish fish = new Fish();
        AnimalFigure animalFigure = new AnimalFigure();
        animalFigure.create(10,0);
        fish.create("가물치","알", animalFigure,"세로");
        fishRepository.save(fish);
    }

    @Test
    public void findAllTest(){
        fishRepository.findAll();
    }

    @Test
    public void findByIdTest(){
        log.info("fish : " + fishRepository.findById(1L).get());

    }
}
