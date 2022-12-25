package com.example.fish.service;

import com.example.fish.domain.vo.FishVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@Slf4j
public class FishServiceTest {
    @Autowired
    private FishService fishService;

    @Test
    public void showAllTest(){
        fishService.showAll().stream().map(FishVO::toString).forEach(log::info);
    }
    @Test
    public void showTest(){
        log.info(fishService.show("빙어")+"");
    }
    @Test
    public void addTest(){
        List<FishVO> fishes = new ArrayList<>();
        FishVO fishVO = new FishVO();
        fishVO.setFishName("흰수염고래");
        fishVO.setFishCount(2);
        fishes.add(fishVO);
        fishService.add(fishes);
    }
    @Test
    public void updateTest(){
        FishVO fishVO = fishService.show("흰수염고래");
        fishVO.setFishCount(3);
        fishService.update(fishVO);
    }
    @Test
    public void deleteTest(){
        fishService.delete(13L);
    }

}
