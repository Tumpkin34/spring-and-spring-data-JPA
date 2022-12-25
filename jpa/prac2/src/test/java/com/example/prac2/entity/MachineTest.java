package com.example.prac2.entity;

import com.example.prac2.repository.FanRepository;
import com.example.prac2.repository.WashingMachineRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@SpringBootTest
@Slf4j
@Transactional
@Rollback(false)
public class MachineTest {
    @Autowired
    private FanRepository fanRepository;
    @Autowired
    private WashingMachineRepository washingMachineRepository;

    @Test
    public void saveTest(){
        Fan fan = new Fan();
        fan.create("강력선풍기", LocalDateTime.of(2020,5,25,0,0,0),4);
        fanRepository.save(fan);
    }

    @Test
    public void updateTest(){
        Fan fan = fanRepository.findById(1L).get();
        fan.setFanWing(5);
    }
}
