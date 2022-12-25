package com.example.music.service;

import com.example.music.domain.dao.MusicDAO;
import com.example.music.domain.vo.MusicVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MusicService {
    private final MusicDAO musicDAO;

//    추가
    public int add (MusicVO musicVO){
        return musicDAO.save(musicVO);
    }
//    수정
    public int update (MusicVO musicVO){
        return musicDAO.setMusic(musicVO);
    }
//    삭제
    public int delete(Long musicNumber){
        return musicDAO.deleteById(musicNumber);
    }
//    조회
    public MusicVO find(Long musicNumber){
        return musicDAO.findById(musicNumber);
    }
//    전체 조회
    public List<MusicVO> show(){
        return musicDAO.findAll();
    }
}
