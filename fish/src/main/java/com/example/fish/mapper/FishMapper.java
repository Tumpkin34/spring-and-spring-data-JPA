package com.example.fish.mapper;

import com.example.fish.domain.vo.FishVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FishMapper {
    //    추가
    public void insert(FishVO fishVO);

    //    수정
    public void update(FishVO fishVO);

    //    삭제
    public void delete(Long fishNumber);

    //    조회
    public FishVO select(String fishName);

    //    전체조회
    public List<FishVO> selectAll();
}
