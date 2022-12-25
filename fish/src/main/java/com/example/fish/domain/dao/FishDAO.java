package com.example.fish.domain.dao;

import com.example.fish.domain.vo.FishVO;
import com.example.fish.mapper.FishMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class FishDAO {
    private final FishMapper fishMapper;

    //    추가
    public void add(FishVO fishVO){fishMapper.insert(fishVO);}

    //    수정
    public void setFish(FishVO fishVO){fishMapper.update(fishVO);}

    //    삭제
    public void removeFish(Long fishNumber){fishMapper.delete(fishNumber);}

    //    조회
    public FishVO findById(String fishName){ return fishMapper.select(fishName);}

    //    전체조회
    public List<FishVO> findAll(){ return fishMapper.selectAll();}
}
