package com.example.prac2.repository;

import com.example.prac2.entity.WashingMachine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WashingMachineRepository extends JpaRepository<WashingMachine, Long> {
}
