package com.example.music.mapper;

import com.example.music.domain.vo.MusicVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MusicMapper {
    //    추가
    public int insert(MusicVO musicVO);

    //    수정
    public int update(MusicVO musicVO);

    //    삭제
    public int delete(Long musicNumber);

    //    조회
    public MusicVO select(Long musicNumber);

    //    전체 조회
    public List<MusicVO> getList();

}
