package com.example.prac2.repository;

import com.example.prac2.entity.Fan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FanRepository extends JpaRepository<Fan,Long> {
}
