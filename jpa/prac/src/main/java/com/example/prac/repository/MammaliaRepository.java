package com.example.prac.repository;

import com.example.prac.entity.Mammalia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MammaliaRepository extends JpaRepository<Mammalia,Long> {
}
