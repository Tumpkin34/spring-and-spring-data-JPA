package com.example.fish.mapper;

import com.example.fish.domain.vo.FishVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class FishMapperTest {
    @Autowired
    private FishMapper fishMapper;

    @Test
    public void selectAllTest(){
        fishMapper.selectAll().stream().map(FishVO::toString).forEach(log::info);
    }
    @Test
    public void selectTest(){
        log.info(fishMapper.select("블루길")+"");
    }
    @Test
    public void insertTest(){
        FishVO fishVO = new FishVO();
        fishVO.setFishName("문어");
        fishVO.setFishCount(6);
        fishMapper.insert(fishVO);
    }

    @Test
    public void updateTest(){
        FishVO fishVO = fishMapper.select("배스");
        fishVO.setFishCount(50);
        fishMapper.update(fishVO);
    }

    @Test
    public void deleteTest(){
        fishMapper.delete(1L);
    }
    
    
}
