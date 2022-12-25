package com.example.fish.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
public class FishVO {
    private Long fishNumber;
    private String fishName;
    private int fishCount;

    List<FishVO> fishes;
}
