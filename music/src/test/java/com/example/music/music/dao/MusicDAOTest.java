package com.example.music.music.dao;

import com.example.music.domain.dao.MusicDAO;
import com.example.music.domain.vo.MusicVO;
import lombok.extern.slf4j.Slf4j;
import org.apache.juli.logging.Log;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class MusicDAOTest {
    @Autowired
    public MusicDAO musicDAO;

    @Test
    public void findAll() {
        musicDAO.findAll().stream().map(MusicVO::toString).forEach(log::info);
    }

    @Test
    public void findById(){
        log.info(musicDAO.findById(8L)+"");
    }

    @Test
    public void addMusic() {
        MusicVO musicVO = new MusicVO();
        musicVO.setMusicTitle("붉은노을");
        musicVO.setMusicSinger("이문세");
        musicVO.setMusicLyrics("소리쳐 부르지만 저 대답 없는 노을만 붉게 타는데");
        musicDAO.save(musicVO);
    }

    @Test
    public void setMusic(){
        MusicVO musicVO = musicDAO.findById(8L);
        musicVO.setMusicLyrics("소리쳐 부르지만 저 대답 없는 노을만 붉게 타는데");
        musicDAO.setMusic(musicVO);
    }

    @Test
    public void deleteById(){
        musicDAO.deleteById(8L);
    }

}
