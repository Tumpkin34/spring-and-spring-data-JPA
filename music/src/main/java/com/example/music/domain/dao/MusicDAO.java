package com.example.music.domain.dao;

import com.example.music.domain.vo.MusicVO;
import com.example.music.mapper.MusicMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MusicDAO {
    private final MusicMapper musicMapper;

    //    추가
    public int save(MusicVO musicVO) {
        return musicMapper.insert(musicVO);
    }

    //    수정
    public int setMusic(MusicVO musicVO) {
        return musicMapper.update(musicVO);
    }

    //    삭제
    public int deleteById(Long musicNumber) {
        return musicMapper.delete(musicNumber);
    }

    //    조회
    public MusicVO findById(Long musicNumber) {
        return musicMapper.select(musicNumber);
    }

    //    전체 조회
    public List<MusicVO> findAll() {
        return musicMapper.getList();
    }


}
