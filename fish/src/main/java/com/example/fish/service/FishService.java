package com.example.fish.service;

import com.example.fish.domain.dao.FishDAO;
import com.example.fish.domain.vo.FishVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FishService {
    private final FishDAO fishDAO;

    //    추가
    public void add(List<FishVO> fishes) {
        for (FishVO fish : fishes) {
            fishDAO.add(fish);
        }
    }


    //    수정
    public void update(FishVO fishVO) {
        fishDAO.setFish(fishVO);
    }

    //    삭제
    public void delete(Long fishNumber) {
        fishDAO.removeFish(fishNumber);
    }

    //    조회
    public FishVO show(String fishName) {
        return fishDAO.findById(fishName);
    }

    //    전체조회
    public List<FishVO> showAll() {
        return fishDAO.findAll();
    }
}
