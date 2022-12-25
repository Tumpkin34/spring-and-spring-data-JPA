package com.example.fish.dao;

import com.example.fish.domain.dao.FishDAO;
import com.example.fish.domain.vo.FishVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class FishDAOTest {
    @Autowired
    private FishDAO fishDAO;

    @Test
    public void findAllTest(){
        fishDAO.findAll().stream().map(FishVO::toString).forEach(log::info);
    }

    @Test
    public void findByIdTest(){
        log.info(fishDAO.findById("문어")+"");
    }

    @Test
    public void addTest(){
        FishVO fishVO = new FishVO();
        fishVO.setFishName("쭈꾸미");
        fishVO.setFishCount(10);
        fishDAO.add(fishVO);
    }
    
    @Test
    public void setFishTest(){
        FishVO fishVO = fishDAO.findById("빙어");
        fishVO.setFishCount(150);
        fishDAO.setFish(fishVO);
    }

    @Test
    public void removeTest(){
        fishDAO.removeFish(8L);
    }

}
